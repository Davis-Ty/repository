from bs4 import  BeautifulSoup
import requests
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time 
from selenium.webdriver.common.keys import Keys
import pandas as pd 


# Set up WebDriver and navigate to the initial URL
webdriver_path = '/Users/ree/Downloads/chromedriver-mac-arm64/chromedriver'
url = 'https://www.espn.com/college-football/stats/player'
headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36'
}

# Initialize WebDriver
driver = webdriver.Chrome()
driver.get(url)

def scrape_header():
    headers = BeautifulSoup(driver.page_source, 'lxml')
    header = headers.find(class_='Table__Scroller')
    tags = header.find_all('a')
    stat_header = [g.get_text() for g in tags]
    header_line = ' '.join(stat_header)
    print(header_line)
    

# Function to scrape player names and stats
def scrape_players_and_stats():
    # Click "Show More" repeatedly until it's not available
    while True:
        try:
            show_more_button = WebDriverWait(driver, 10).until(EC.element_to_be_clickable((By.CLASS_NAME, 'loadMore__link')))
            show_more_button.click()
            time.sleep(2)  # Introduce a delay to allow content to load
        except Exception as e:
            print("No more 'Show More' button found. Exiting.")
            break
    
    # Scrape player names and stats from the fully loaded page
    soup = BeautifulSoup(driver.page_source, 'lxml')
    players_chart = soup.find(class_='Table__TBODY')
    
    # Scrape player names
    player_tags = players_chart.find_all('a')
    players = [tag.get_text() for tag in player_tags]
    
    # Scrape player stats
    tbody_elements = soup.find_all(class_='Table__TBODY')
    
    if len(tbody_elements) >= 2:
        second_players_chart = tbody_elements[1]
        td_elements = second_players_chart.find_all('td', class_='Table__TD')
        
        # Initialize a list to group statistics in sets of 11
        grouped_stats = []
        
        for index, td_element in enumerate(td_elements):
            player_stat = td_element.get_text()
            
            # Add the player_stat to the current group
            if index % 11 == 0:
                grouped_stats.append([player_stat])
            else:
                grouped_stats[-1].append(player_stat)
        
        # Print player names and their corresponding stats
        for player, stats in zip(players, grouped_stats):
            print(f"Player: {player}")
            print("Stats:", ' | '.join(stats))  # Join each group with a separator, e.g., '|'
            
    
    data = {'Player': players, 'Stats': [' | '.join(stats) for stats in grouped_stats]}
    df = pd.DataFrame(data)

    # Save the DataFrame to an Excel file
    excel_filename = 'college_football_stats34.xlsx'
    df.to_excel(excel_filename, index=False)
    print(f"Data saved to {excel_filename}")




# Scrape player names and stats
scrape_header()
scrape_players_and_stats()

# Close the WebDriver when done
driver.quit()



