import java.util.ArrayList;
import java.util.List;

public class Practical7_practice {
    
      // generics


      public static <T> int countElements( List<T> list , String type ){
          int count =0;
         for ( T element : list){

                // check even count 

                if ( type =="Even" && element instanceof Integer){
                    if ( (Integer)element %2==0) {
                        count++;
                    }
                }

                // check odd count 

                if ( type=="Odd"  && element instanceof Integer){
                  if ( (Integer)element %2!=0){
                    count++;
                  }

                }

                if ( type=="prime" && element instanceof Integer){

                    if ( isPrime((Integer)element)){
                        count++;
                    }
                }

                if ( type=="Palindrome" && element instanceof String){
                    if ( isPalindrome( (String)element)){
                        count++;
                    }
                }
         }
         return count;
      }


      public static boolean isPrime( int num){
         if ( num<=1) return false;
          
          for ( int i=2 ; i<=Math.sqrt(num) ; i++){
               if ( num%2==0) return false ;
          }
        return true;
      }

      public static boolean isPalindrome ( String word ){

          String reversed = new StringBuilder(word).reverse().toString();
          return word.equalsIgnoreCase(reversed);
      }


      public static void main(String[] args) {
        List <Integer>list = new ArrayList<>();
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20); // total 5 evn

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5); // total 4 odd
        

         List<String> words = new ArrayList<>();
         words.add("madam");
  words.add("Madam");
  words.add("racecar");

         int evenCount = countElements(list, "Even");
         System.out.println( " total even in list:-"+evenCount);

         int oddCount = countElements(list, "Odd");
         System.out.println( " total odd in list:-"+oddCount);

         int palindromeCount = countElements(words, "Palindrome");
         System.out.println( " total palindrome in list:-"+palindromeCount);
      }




}
