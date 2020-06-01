class FilaPura {
    private int busca(int[] array, int i, int n) {
        if (i == array.length)
            return -1;
        else if (array[i] == n) 
            return i;
        else
            return busca(array, ++i, n);
    }
    
    public void filaPura (int[] array, int n) {
        int x = 1, i = busca(array, 0, n);
    }

    public static void main(String[] args) {
        FilaPura f = new FilaPura();

        String input = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		
		String[] array_str = input.split(" ");
        int[] array_int = new int[array_str.length];
        
        for (int i = 0; i < array_int.length; i++) {
        	array_int[i] = Integer.parseInt(array_str[i]);
        }

        f.filaPura(array_int, n);  
    }    
}