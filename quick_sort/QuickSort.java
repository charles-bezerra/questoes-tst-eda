import java.util.Arrays;
import java.util.Scanner;

class QuickSort {
    private void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            
            if(i+1 != array.length)
                System.out.print(" ");
        }
        System.out.println("");
    }

    
    private void quickSort(int[] array, int start, int end){        
        if(start < end){            
            
            int pivo_index = start;
            int pivo = array[pivo_index];
            int i = start+1;
            
            while( i <= end && pivo > array[i] ){
                array[i-1] = array[i];
                array[i] = pivo;
                pivo_index = i;
                i++;
            }
        
            print(array);
            
            quickSort(array, start, pivo_index-1); //sorting of the pivo left 
            quickSort(array, pivo_index+1, end); //sorting of the pivo right
        }
    }


    public void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        sc.close();

        String[] array_input_str = input.split(" ");

        int[] array_input_int = new int[array_input_str.length];
        for(int i = 0; i < array_input_int.length; i++) {
            array_input_int[i] = Integer.parseInt(array_input_str[i]);
        }

        QuickSort q = new QuickSort();
        q.quickSort(array_input_int);

        System.out.println("$");
    }

}