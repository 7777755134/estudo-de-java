package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcao ;
		
		System.out.println("========== calculadora =========== ");
		System.out.println("1 : somar numeros : ");
		System.out.println("2 : dividir numero :");
		System.out.println("3 :  mutiplicar :");
		System.out.println("4 : subtrair : ");
		System.out.println("5 : tranformção de graus em fahrenheit : ");
		System.out.println("6 : caulculo seno cosseno e tangente   : ");

		System.out.println("digite sua opção  :  ");
		
		opcao = sc.nextInt();
		
		if (opcao == 1 ) {
			
			double num1, num2 , res ;
			System.out.println("============= SOMA ==========   ");
			System.out.println("digite seu primero numero para a soma  : ");
			num1 = sc.nextDouble();
			System.out.println("digite seu segundo numero para a soma  : ");
			num2 = sc.nextDouble();
			
			res = num1 + num2 ;
			
			System.out.println("=========== RESULTADO  ==========   ");
			System.out.println("resutado da soma foi : " + res );
		}
		else if (opcao ==  2 ) {
			double num1, num2 , res ;
			System.out.println("============= DIVISÃO ==========   ");
			System.out.println("digite seu primero numero para a divisão  : ");
			num1 = sc.nextDouble();
			System.out.println("digite seu segundo numero para a divisão   : ");
			num2 = sc.nextDouble();
			
			res = num1 / num2 ;
			
			System.out.println("=========== RESULTADO  ==========   ");
			System.out.println("resutado da soma foi : " + res );
		}
		
		else if (opcao == 3 ) { 

			double num1, num2 , res ;
			System.out.println("============= MUTIPLICAÇÃO  ==========   ");
			System.out.println("digite seu primero numero para a mutiplicação  : ");
			num1 = sc.nextDouble ();
			System.out.println("digite seu segundo numero para a mutiplicação   : ");
			num2 = sc.nextDouble ();
			
			res = num1 *  num2 ;
			
			System.out.println("=========== RESULTADO  ==========   ");
			System.out.println("seu resutado foi : " + res );
			
		}
		
		else if (opcao == 4 ) {
			double num1, num2 , res ;
			System.out.println("============= SUBTRAÇÃO==========   ");
			System.out.println("digite seu primero numero para a subtração  : ");
			num1 = sc.nextDouble();
			System.out.println("digite seu segundo numero para a subtração  : ");
			num2 = sc.nextDouble();
			
			res = num1 -  num2 ;
			
			System.out.println("=========== RESULTADO  ==========   ");
			System.out.println("seu resutado foi : " + res );
			
		}
		
		else if  ( opcao == 5 ) {
			
			

			
			double graus , fh ;
			
			System.out.println("============= TRANSFORMAÇÃO  ==========   ");
			System.out.println(" Digite o valor que você irar tranformar :   ");
			graus = sc.nextDouble();
			fh = (graus * 9/5 ) + 32  ;
			System.out.println("============= RESULTADO  ==========   ");
			System.out.println("seu resutado foi : " + fh );	 
			    
			 
		}
		
		else if (opcao == 6  ) {
			System.out.println("============= TABELA   ==========   ");
			System.out.println("1 - caulcular o seno :    ");
			System.out.println("2 - calcula o cosseno  ");
			System.out.println("3 - calcular a tangente :   ");
			System.out.println("============= TABELA  ==========   ");
			
			int opcao_tabela ;
			
			System.out.println("digite sua opção :    ");
			
			opcao_tabela = sc.nextInt();
			
			if (opcao_tabela == 1  ) {
				
				double cateto_oposto , hipotenusa, res ; 
				
				System.out.println("============= CALCULO SENO    ==========   ");
				System.out.println(" Formula utilizado para saber o seno :   " + "cateto oposto / hipotenusa ");
				System.out.println("digite o valor do seno :  ");
				
				cateto_oposto = sc.nextDouble();
				
				System.out.println("digite o valor da  hipotenusa  :  ");
				hipotenusa = sc.nextDouble();
				
				res = cateto_oposto / hipotenusa ;
				
				System.out.println("============= RESULTADO  ==========   ");
				System.out.println("resutado do seno :  " + res );
				
			}
			else if (	opcao_tabela == 2 ) {
				System.out.println("============= CALCULO CATETO OPOSTO     ==========   ");
				System.out.println(" Formula utilizado para saber o seno :   " + "cateto adjacente / hipotenusa ");
				System.out.println("digite o valor do cateto adjacente :  ");
				
				double cateto_ad , hipotenusa, res ; 
				
				cateto_ad = sc.nextDouble();
				
				System.out.println("digite o valor da hipotenusa  :  ");
				
				 hipotenusa =  sc.nextDouble();
				 
				 res = cateto_ad / hipotenusa ;
				 
					System.out.println("============= RESULTADO  ==========   ");
					System.out.println("resutado do cateto oposto  :  " + res );
					
			}
			else if (opcao == 3  ) {
				
				System.out.println("============= CALCULO TANGENTE      ==========   ");
				System.out.println(" Formula utilizado para saber a tangente  :   " + "cateto adjacente / cateto adjacente  ");
				System.out.println("digite o valor do cateto adjacente  :  ");
				double cateto_ad  , cateto_op, res ; 
				
				cateto_ad = sc.nextDouble();
				
				System.out.println("digite o valor do cateto oposto  :  ");
				cateto_op = sc.nextDouble();

				 res = cateto_ad / cateto_op ;
					System.out.println("============= RESULTADO  ==========   ");
					System.out.println("resutado do cateto oposto  :  " + res );
				
				
			}
			else {
				System.out.println(" OPÇÃO INVALIDA, TENTE NOVAMENTE  :   ");
	
			}	
		}
		
		else {
			System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE  : ");

		}
				
	}

}
