package aplicacao;

import java.util.Scanner;
/*
 * Utilizando laços de repetição crie uma aplicação que receba a idade e o peso de 10 pessoas. 
 * Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. 
 * As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 31 anos.
 */

public class Pessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			double med1 = 0, med2 = 0,med3 = 0 ,med4 = 0,soma,x;
		
			soma=0;
			x=0;
			for(int i = 1; i<=10; i++){
				
			
			       System.out.println("Digite a idade: ");
			        int idade = sc.nextInt();
			        System.out.println("Digite o peso: ");
			        int peso = sc.nextInt();

			        
					if( idade >= 1 && idade <= 10){
			        	
			                x=x+1;
			                
			                soma=soma+peso;
			                
			                med1=soma/x;

			        }
			        if(idade >= 11 && idade <= 20){
			                x=x+1;
			                soma=soma+peso;
			                med2=soma/x;

			        }
			        if(idade >= 21 && idade <= 30){
			                x=x+1;
			                soma=soma+peso;
			                med3=soma/x;

			        }
			        if(idade >= 31){
			                x=x+1;
			                soma=soma+peso;
			                med4=soma/x;

			        }

			}
	 System.out.println("A media dos pesos das pessoas entre 1 e 10 anos: " + med1);
	 System.out.print("A media dos pesos das pessoas entre 11 e 20 anos: " + med2);
	 System.out.print(" A media dos pesos das pessoas entre 21 e 30 anos: " + med3);
	 System.out.print(" A media dos pesos das pessoas maiores q 31 anos: " + med4);

sc.close();

	}
		
			}