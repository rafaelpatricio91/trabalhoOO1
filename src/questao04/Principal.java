package questao04;

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		int formaDePgto;
		Double valorVenda;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1-Venda a Vista\n" + 
				"2-Venda a Prazo 30 dias\n" + 
				"3-Venda com cartão de débito\n" + 
				"4-Venda com cartão de crédito\n" + 
				"Escolha a opção:");
		
		formaDePgto = scan.nextInt(); scan.nextLine();
		
		System.out.println("Informe o valor da venda: ");
		valorVenda = scan.nextDouble(); scan.nextLine();
		
		switch (formaDePgto)
		{
		case 1:
			System.out.println("VENDA A VISTA - 10% de desconto");
			System.out.println("Valor total: " + ((valorVenda) - (valorVenda * 0.10) ) );
			break;
		case 2:
			System.out.println("VENDA A PRAZO - acréscimo de 10%");
			System.out.println("Valor total: " + ((valorVenda) + (valorVenda * 0.10) ) );
			break;
		case 3:
			System.out.println("VENDA COM CARTÃO DE DÉBITO - desconto de 8%");
			System.out.println("Valor total: " + ((valorVenda) - (valorVenda * 0.08) ) );
			break;
		case 4:
			System.out.println("VENDA COM CARTÃO DE CRÉDITO - acréscimo de 5%");
			System.out.println("Valor total: " + ((valorVenda) + (valorVenda * 0.05) ) );
			break;
		}

		}
	}		
	
//	Venda a Vista - desconto de 10%
//	Venda a Prazo 30 dias - acréscimo de 10%
//	Venda com cartão de débito - desconto de 8%
//	Venda com cartão de crédito - acréscimo de 5%

