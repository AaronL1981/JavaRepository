
public class Week3Class {

  // Question 1: Create an array of int called ages that contains the following values:
  // 3,9,23,64,2,8,28,93.
 
  public static void main(String[] args) {
    int[] myArray = {3,9,23,64,2,8,28,93,41}; // 1b. add new age of 41 to original array
    System.out.println("The last age in my Array is " + myArray[myArray.length - 1]); 
    
    double totalAge = 0;
    for (int i = 0; i < myArray.length; i++) { //1c. created a double variable to  
       totalAge += myArray[i];                 //calculate the total number in myArray.
     }
    double average = totalAge / myArray.length; //used the for loop to get the totalAge
    System.out.println("The average age: " + average); // created another variable to get the average.
   
    
    String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
     
    int sumLetters = 0;
    
    for (int i = 0; i < names.length; i++) {
      sumLetters += names[i].length();
    }
     int averageLetters = sumLetters / names.length;
    System.out.println("The average number of letters per name: " + averageLetters);  
    
    String allTheNames = "";
    
    for (int i = 0; i < names.length; i++) {
      allTheNames += names[i] + " ";
  }
  System.out.println(allTheNames);
  
  // Last element of any array
  int arrayLength=names.length;
  System.out.println("Use array[arr.length] to access the last element of an array: " + arrayLength);
  
  // First element of any array
  System.out.println("Use array[0] to access the first element of an array: " + names[0]);
  
  /**
   *  5. Create a new array of int called nameLengths. Write a loop to iterate over the previously
   *     created names array and add the length of each name to the nameLengths array.
   */
  
  int[] nameLengths = new int[names.length];
  for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length(); 
  }
  /**
   *  6. Write a loop to iterate over the nameLengths array and calculate the sum of all the
   *     elements in the array. Print the result to the console.
   */
  
  int sumNameLengths = 0;
  for (int i = 0; i < nameLengths.length; i++) {
      sumNameLengths += nameLengths[i];
  }
  System.out.println("The sum of all element lengths in nameLengths = " + sumNameLengths);  
  
  
  System.out.println(multiplyString("Hello", 5));
  /**
   * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name
   *    (the full name should be the first and the last name as a String separated by a space).
   */
  
  
  String firstName = "Aaron";
  String lastName = "Lindsay";
  String fullName = createFullName(firstName, lastName);
  
  System.out.println(fullName);
  
  int[] myIntArray = new int[5];
  myIntArray[0] = 3;
  myIntArray[1] = 33;
  myIntArray[2] = 12;
  myIntArray[3] = 65;
  myIntArray[4] = 12;
  
   
  int sum = sumArray(myIntArray);
  
  System.out.println(sum);}
  
   public static String createFullName(String firstName, String lastName) { 
   String fullName = firstName + " " + lastName;
   return(fullName);
   }
   
   public static String multiplyString(String word, int num) {
     String result = "";
     for (int i = 0; i < num; i++) {
       result += word;
     }
     return result;
   }
  
   public static int sumArray(int[] numbers) {
     int sum = 0;
     for (int number : numbers) {
       sum += number;
     }
     return sum;
   }
  
  
}

 
 