import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public void selectionSort (int[] array) {
        selectionSort(array, 0);
    }

    
    private void selectionSort (int[] array, int i){
        if (i < array.length-1){
            int min_i = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min_i])
                    min_i = j;
            }
            
            if (min_i == i && i == array.length-2) 
                return; 

            swape(array, i, min_i);            
            print(array);
            selectionSort(array, i+1);
        }
    }


    private void swape(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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

        SelectionSort mysort = new SelectionSort();
        mysort.selectionSort(array_int);
    }   
}