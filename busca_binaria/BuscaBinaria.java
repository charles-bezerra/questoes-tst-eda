import java.util.Scanner;

class BuscaBinaria {
	public int buscaBinaria(int[] array, int left, int right, int n){
		if(left>right) 
			return -1;

		else {
			int middle = left + (right-left)/2;
			
			if (array[middle] == n)
				return middle;
				
			else if (n > array[middle]) {
				System.out.println(middle);
				return buscaBinaria(array, middle+1, right, n);
			} 
			else {
				System.out.println(middle);
				return buscaBinaria(array, left, middle-1, n);
			}
		}
	}

	public int buscaBinaria(int[] array, int n) {
		return buscaBinaria(array, 0, array.length-1, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        BuscaBinaria b = new BuscaBinaria();

        String input = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		
		String[] array_str = input.split(" ");
        int[] array_int = new int[array_str.length];
        
        for (int i = 0; i < array_int.length; i++) {
        	array_int[i] = Integer.parseInt(array_str[i]);
        }

        System.out.println( b.buscaBinaria(array_int, n) );
	}
}