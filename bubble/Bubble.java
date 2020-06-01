import java.util.Scanner;
import java.util.Arrays;

class Bubble {
    public void sort(int[] array) {
        sort(array, 0);
    }

    private void sort(int[] array, int i) {
        if (i < array.length) {
            int cont = 0;
            
            for(int j = 0; j < array.length-1; j++)
                if (array[j]>array[j+1]) {
                    swape(array, j, j+1);
                    cont++;
                }          
            
            if (cont == 0) 
                return;

            print(array);
            sort(array, i+1);
        }
    }

    private void swape(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);            
            if(i+1 != array.length)
                System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] array_string = input.split(" ");
        int[] array_int = new int[array_string.length];
        for(int i = 0; i < array_string.length; i++) {
            array_int[i] = Integer.parseInt(array_string[i]);
        }

        Bubble b = new Bubble();
        b.sort(array_int);
    }    
}