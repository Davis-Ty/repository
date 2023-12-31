package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @author Tyon Davis
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 * @param now name takes pname place
	 */
  public Person1(String name) {
    this.name = name;
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
		String nameRotated ="";
	  //Person 1 put your implementation here
	  if (name.length()<2|| name.isEmpty()) {
		return name;
	  }else{
		name.charAt(0);
		for (int i=2; i<name.length(); i++){
			nameRotated=nameRotated+name.charAt(i);
											
		}
		//Rotating first two letters to the end
		for (int i=0; i<2; i++){
			nameRotated=nameRotated+name.charAt(i);									
		}
	  return nameRotated;
	}}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String nameRotated) {
	  return "\n"+name +"\n"+ calc(nameRotated)+"\n";
	}

}
