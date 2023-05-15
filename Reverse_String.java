public class Reverse_String {
    public static void main(String[] args) {


        String stringExample  =  "ABCDEFG";

        System.out.println("Original string: "+stringExample);


        // Declaring a StringBuilder and converting string to StringBuilder

        StringBuilder reverseString = new StringBuilder(stringExample);


        reverseString.reverse();  // Reversing the StringBuilder


        // Converting StringBuilder to String

        String result = reverseString.toString();


        System.out.println("Reversed string: "+result); // Printing the reversed String


    }
}
