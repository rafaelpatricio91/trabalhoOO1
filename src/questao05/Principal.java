package questao05;

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		
	int operador;
	Double n1, n2;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Valor 1: ");
	n1 = scan.nextDouble(); scan.nextLine();
	
	System.out.println("Informe os operadores:\n *-*-*-*-*-*-*-*-*-*-*-*-*" 
			+ " 1: Adição \n 2: Subtração \n 3: Multiplicação\n 4: Divisão\n Outro valor para sair\n *-*-*-*-*-*-*-*-*-*-*-*-*\n");
	operador = scan.nextInt(); scan.nextLine();
	
	while (operador > 0 && operador < 5)
	{
		System.out.println("Valor 2: ");
		n2 = scan.nextDouble(); scan.nextLine();
		
		if (operador == 1)
		{
			System.out.println( (n1 +" + "+ n2) +" = "+ (n1+n2)+"\n");
		}
			else if (operador == 2) 
			{
				System.out.println( (n1 +" - "+ n2) +" = "+ (n1-n2)+"\n");
			}
			else if (operador == 3) 
			{
				System.out.println( (n1 +" * "+ n2) +" = "+ (n1*n2)+"\n");
			}
			else if (operador == 4) 
			{
				System.out.println( (n1 +" / "+ n2) +" = "+ (n1/n2)+"\n");
			}
			else 
			{
				System.out.println("Saindo...");
				return;
			}
		
		System.out.println("Valor 1: ");
		n1 = scan.nextDouble(); scan.nextLine();
		
		System.out.println("Informe os operadores:\n *-*-*-*-*-*-*-*-*-*-*-*-*" 
				+ " 1: Adição \n 2: Subtração \n 3: Multiplicação\n 4: Divisão\n Outro valor para sair\n *-*-*-*-*-*-*-*-*-*-*-*-*\n");
		operador = scan.nextInt(); scan.nextLine();
		}
		
	}
}