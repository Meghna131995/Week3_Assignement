import java.util.Arrays;

public class Sort_array {
    public static void main(String[] args)
    {
//defining an array of integer type
        int [] array = new int [] {900, 203, 50, 109, 102, 220, 67, 304};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
