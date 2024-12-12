
// Generics are used to provide type safety , list uses generics 
import java.util.ArrayList;
import java.util.List;


public class Practical7 {

    public static <T> int countElements(List<T> list, String type) {
        int count = 0;
        // enhanced for loop also called as for each loop
        for (T element : list) {

            /// function to check and count even numbers in the list
            if (type == "Even" && element instanceof Integer) {
                // we need to convert or we can say typecast the element to integer as it is of
                // object type
                if ((Integer) element % 2 == 0) {
                    // increament count
                    count++;
                }
            }

            else if (type == "Odd" && element instanceof Integer) {
                if ((Integer) element % 2 != 0) {
                    count++;

                }
            } else if (type == "Prime" && element instanceof Integer) {
                if (isPrime((Integer) element)) {
                    count++;
                }
            }

            else if (type == "Palindrome" && element instanceof String) {
                if (isPalindrome((String) element)) {
                    count++;
                }
            }

        }
        return count ;

    }


    public static boolean isPrime( int num){
  if ( num <=1) return false;
  for ( int i =2 ; i <Math.sqrt(num);i++ ){
        if ( num% 2 ==0) return false;
    }
    return true;

}

public static boolean isPalindrome( String word){

    String reversed = new StringBuilder( word).reverse().toString();
     return word.equalsIgnoreCase(reversed);

}

public static void main(String[] args) {
    
 List < Integer> numbers = new ArrayList<>();
 List<String> words = new ArrayList<>();

   numbers.add(20);
   numbers.add(30);
   numbers.add(40);
   numbers.add(7);
   numbers.add(5);
   numbers.add(37);

   numbers.add(57);

  words.add("madam");
  words.add("new");
  words.add("racecar");

  

  int evenCount = countElements(numbers, "Even");
  System.out.println( "number of even elments" +evenCount);

  int oddCount = countElements(numbers, "Odd");
  System.out.println( "number of odd elments" +oddCount);

  int primeCount = countElements(numbers, "Prime");
  System.out.println( "number of prime elments" +primeCount);

  int palindromeCount = countElements(words, "Palindrome");
  System.out.println( "number of palindrome elments" +palindromeCount);
}

}
