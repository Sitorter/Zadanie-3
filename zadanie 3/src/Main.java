import java.util.Scanner;

public class Main {
    public static void makro(int a, int b, int c){
        int max;
        if (a>b){
            max = a;
            if (max>c){
                max = a;
            }
            else {
                max = c;
            }
        }
        else {
            max = b;
            if (max>c){
                max = b;
            }
            else {
                max = c;
            }
        }
        System.out.println("Najwieksza liczba to = "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = sc.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = sc.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int c = sc.nextInt();
        sc.close();
        makro(a, b, c);
    }
}