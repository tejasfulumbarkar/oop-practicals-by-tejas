
    import java.util.ArrayList;
import java.util.List;

 class GenericFilter {

    // Method to count elements in a collection that satisfy a condition
    public static <T> int countElements(List<T> list, String type) {
        int count = 0;

        for (T element : list) {
            if (type.equals("even") && element instanceof Integer) {
                if ((Integer) element % 2 == 0) {
                    count++;
                }
            } else if (type.equals("odd") && element instanceof Integer) {
                if ((Integer) element % 2 != 0) {
                    count++;
                }
            } else if (type.equals("prime") && element instanceof Integer) {
                if (isPrime((Integer) element)) {
                    count++;
                }
            } else if (type.equals("palindrome") && element instanceof String) {
                if (isPalindrome((String) element)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        // List of strings
        List<String> words = new ArrayList<>();
        words.add("madam");
        
        // Count even numbers
        int evenCount = countElements(numbers, "even");
        System.out.println("Even numbers count: " + evenCount);

        // Count odd numbers
        int oddCount = countElements(numbers, "odd");
        System.out.println("Odd numbers count: " + oddCount);

        // Count prime numbers
        int primeCount = countElements(numbers, "prime");
        System.out.println("Prime numbers count: " + primeCount);

        // Count palindromes
        int palindromeCount = countElements(words, "palindrome");
        System.out.println("Palindrome count: " + palindromeCount);
    }
}


