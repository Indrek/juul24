package arrayd;

import java.util.Arrays;

public class Naide {

    public static void main(String[] args) {
        //Eesmärk pöörata massiiv ümber
        //{5,4,3,2,1} -> {1,2,3,4,5}
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int halfLength = array.length / 2;
        int maxIndex = array.length - 1;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

}
