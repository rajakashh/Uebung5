import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {

        int[] myArray = {5, 6, 7, 10};
        
        System.out.println("Original Array: " + Arrays.toString(myArray));
        

        int temp;
        for (int i = 0; i < myArray.length / 2; i++) {

            temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        
        System.out.println("Umgekehrtes Array: " + Arrays.toString(myArray));
    }
}

