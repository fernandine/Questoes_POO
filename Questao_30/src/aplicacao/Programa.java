package aplicacao;

import java.util.Scanner;
/*
 * Desenvolva um programa que continue lendo uma senha at� que ela seja v�lida. 
 * Caso a senha estiver errada, escreva no console �Senha Inv�lida� e ler novamente o pr�ximo input. 
 * Quando ler a senha correta deve escrever no console �Acesso garantido� e finalizar a aplica��o. A senha correta � 2018.
 */

public class Programa {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		        int senha = sc.nextInt();

		        while (senha != 2018) {
		            System.out.println("Invalida");
		            senha = sc.nextInt();
		        }

		        System.out.println("Acesso Permitido");

		        sc.close();
		    }
		}