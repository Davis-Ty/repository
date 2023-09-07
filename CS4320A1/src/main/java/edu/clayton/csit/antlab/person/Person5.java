package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String name) {
		
		//if string has 3 or more characters 
		if (name.length()>2){

		// set first 2 chars of string as char1 & char2
			char char1= name.charAt(0);
			char char2= name.charAt(1);


		// replace first 2 characters of string with last 2 of string
			replace(name.charAt(0),name.charAt(name.length()-2);
			replace(name.charAt(1),name.charAt(name.length()-1);
		
		//replace last 2 characters of string with char1 & char2 variables 
			replace(name.charAt(name.length()-2), char1);
			replace(name.charAt(name.length()-1), char2);
		}

	  return name;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String n) {
	  return name + calc(n);
	}

}
