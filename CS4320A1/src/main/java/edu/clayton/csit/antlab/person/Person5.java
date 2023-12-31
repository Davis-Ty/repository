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
  }
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
		String revName;

		//if string has 3 or more characters 

			revName=name.substring(2, name.length())+name.substring(0,2);
						
		return revName;
	  
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
