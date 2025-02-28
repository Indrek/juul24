import java.util.Arrays;

public class Harjutus {

    public static void main(String[] args) {
        //Sorteeri array kahanevas järjekorras
        //{4,2,1,3,5} -> {5,4,3,2,1}
        int[] array = {4,5,8,1,3,2,9,7,6};
        System.out.println("Array = " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Sorted array = " + Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;

            for(int i = 0; i < array.length-1; i++) {
                if(array[i] < array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
