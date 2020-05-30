import java.util.Arrays;
import java.util.Scanner;

class InsertionSort {
    public void insertionSort(int[] array){
        this.insertionSort(array, 1);
    }


    private void insertionSort(int[] array, int i){
        if (i != 1)
            print(array);

        if (i == array.length) 
            return;

        int j = i-1, key = array[i];
        
        while (j>=0 && key < array[j] ) {
            array[j+1] = array[j];
            array[j] = key;
            j--;
        }

        insertionSort(array, i+1);
    }


    private void print(int[] array){
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
   
        String[] array_string = input.split(" ");

        int[] array_int = new int[array_string.length];
        for(int i = 0; i < array_string.length; i++){
            array_int[i] = Integer.parseInt(array_string[i]);
        }

        InsertionSort sort = new InsertionSort();
        sort.insertionSort(array_int);
    }    
}