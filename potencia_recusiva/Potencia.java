import java.util.Scanner;

class Potencia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println(pow(base,exp));
    }

    public static int pow(int base, int exp){
        return (exp==0) ? 1 : pow(base, exp-1)*base;
    }
}