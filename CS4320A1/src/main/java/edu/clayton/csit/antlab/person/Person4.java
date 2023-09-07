package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 4 put your implementation here
      public class IncrementStringCharacters {
        public static String incrementCharacters(String input) {
          // Check if the input string is null or empty
          if (input == null || input.isEmpty()) {
            return input;
          }
          // Create a StringBuilder to store the result
          StringBuilder result = new StringBuilder();

          //Iterate through the characters of the input string
          for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAT(i);
            // Check the charcter
            if (( currentChar >= 'a' && currentChar < 'z') || (currentChar >= 'A' && currentChar < 'Z')) {
              result.append((char) (currentChar + 1 ));
            }
            else if (currentChar >= '0' && currentChar < '9') {
              result.append((char) (currentChar + 1));
            }
             else {
              result.append(currentChar);
             }

            }

            // Convert the StringBuilder to a string and return it
            return result.toString();

          }
          public static void main(String[] args) {
            String input = "abc123";
            String result = incrementCharacters(input);
            System.out.println(result); // This will print "bcd234"
          }
        }
      
      return null;
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

