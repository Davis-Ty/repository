package edu.clayton.csit.antlab.person;;
/**
 *  A simple class for person 3
 *  returns their name and a
 *  reversed string
 *  
 *  @author  Qu
 *  @version 1.1
 */
public class Person3 {
   /** Holds the persons real name */  
    private String name;
   
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person3(String pname){
      name = pname;
    }
   
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */

   
    /**
     * This method should take the string
     * input and return its reverse.
     * given "gtg123b" it should return
     * b321gtg.
     *
     * @param input the string to be reversed
     * @return the reversed string
     */
    private String calc(String input) {
      //Person 3 put your implementation here

      //no need to make a class for this
      //public class StringReversal {
      //public static String reverseString(String input) {
            // check if the input string is null or empty
            if (name.length()<2 || input.isEmpty()) {
                return input;
            }else{

            // Create a StringBuilder to store the reversed string
            StringBuilder reveresed = new StringBuilder();
            // Iterate through the characters of the input tring in reverse order
            for (int i = input.length() -1; i >= 0; i--) {
                reveresed.append(input.charAt(i));
            }
            // Convert the StringBuilder to a string and return it
            return reveresed.toString();
          }
        //we dont need a driver
      //  public static void main(String[] args) {
        //    String input = "gtg123b";
          //  String reversed = reverseString(input);
           // System.out.println(reversed); // This will print "b321gtg"
        //}
      }

    //This is the output 
  public String toString(String input) {

      
      return name + calc(input);
    }
}
