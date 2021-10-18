package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n;
	Scanner ulaz = new Scanner(System.in);
	System.out.println("Unesite n: ");
	n = ulaz.nextInt();
	for(int i = 1; i <= n; i++) {
	    int s = sumaCifara(i);
	    if(i % s == 0) System.out.println(i);
    }
    }
    static int sumaCifara(int x) {
        int a;
        int suma = 0;
        do {
            a = x % 10;
            x = x / 10;
            suma = suma + a;
        } while(x != 0);
        return suma;
    }
}
