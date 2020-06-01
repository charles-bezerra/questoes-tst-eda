import java.util.Scanner;

class BuscaLinear {
    private int buscaLinear (int[] array, int n, int i) {
        if (i == array.length)
            return -1;
        else if ( array[i] == n )
            return i;
        else
            return buscaLinear(array, n, ++i);
    }  

    public int buscaLinear (int[] array, int n) {
        return buscaLinear(array, n, 0);
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        BuscaLinear b = new BuscaLinear();

        String input = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		
		String[] array_str = input.split(" ");
        int[] array_int = new int[array_str.length];
        
        for (int i = 0; i < array_int.length; i++) {
        	array_int[i] = Integer.parseInt(array_str[i]);
        }

        System.out.println( b.buscaLinear(array_int, n) );        
    }
}