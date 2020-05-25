import java.util.Scanner;

class Potencia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        sc.close();
        
        System.out.println(pow(base,exp));
    }

    public static int pow(int base, int exp){
        if (exp==0) 
            return 1; 
        return pow(base, exp-1)*base;
    }
}