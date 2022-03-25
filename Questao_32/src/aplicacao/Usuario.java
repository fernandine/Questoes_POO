package aplicacao;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		System.out.println("O usuario digitou o nº: " +num);
		for(int i = 0; i< num; i++) {
			System.out.print("Incomoda ");
		}
		
		System.out.println("muito mais");
		
		sc.close();

	}

}
