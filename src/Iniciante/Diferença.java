package Iniciante;


import java.util.Scanner;

public class Diferenša {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B =  ler.nextInt();
		int C = ler.nextInt();
		int D = ler.nextInt();
		
		int DIFERENCA = (A*B - C*D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);

	}

}
