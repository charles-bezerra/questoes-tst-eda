import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    
    public void sort(int[] array){
        this.mergeSort(array, 0, array.length-1);
    }

    private void merge(int[] array, int start, int end, int middle) {
        if(end-start+1==0) return;

        int i,
            left_i = 0, 
            right_i = 0;
        
        int[] 
            leftArray = new int[middle-start+1], 
            rightArray = new int[end-middle];

        for(i = 0; i < leftArray.length; i++){
            leftArray[i] = array[start+i];
        }

        for(i = 0; i < rightArray.length; i++){
            rightArray[i] = array[middle+i+1];
        }

        for(i = start; i <= end; i++){
            if( left_i < leftArray.length && right_i < rightArray.length ){
                if( leftArray[left_i] < rightArray[right_i] ){
                    array[i] = leftArray[left_i];
                    left_i++;
                }
                else {
                    array[i] = rightArray[right_i];    
                    right_i++;
                }
            }
            else if(left_i < leftArray.length){
                array[i] = leftArray[left_i];
                left_i++;
            }
            else if(right_i < rightArray[right_i]){
                array[i] = rightArray[right_i];
                right_i++;
            }
        }

        print(array, start, end);
    }
    
    
    private void mergeSort(int[] array, int start, int end) {        
        print(array, start, end);
        
        if( (end-start)+1 > 1) {
            int middle =  start + (end-start)/2;

            mergeSort(array, start, middle); //branch left 
            mergeSort(array, middle+1, end); //branch right
            merge(array, start, end, middle); //merge branchs
        }
    }


    private void print(int[] array, int start, int end){
        int[] array_aux = new int[end-start+1];

        for(int i = 0; i < array_aux.length; i++){
            array_aux[i] = array[start+i];
        }

        System.out.println(Arrays.toString(array_aux));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeSort mergesort = new MergeSort();
        String input;
        
        input = sc.nextLine();
        sc.close();
        
        String[] l1 = input.split(" ");
        int[] l2 = new int[l1.length];

        for (int i = 0; i < l2.length; i++) {
            l2[i] = Integer.parseInt(l1[i]);
        }

        mergesort.sort(l2);
    }
}