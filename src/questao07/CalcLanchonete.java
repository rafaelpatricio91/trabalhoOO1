package questao07;

import java.util.Scanner;

public class CalcLanchonete
{
	
	public static void main(String[] args)
	{
		Lanchonete lanche = new Lanchonete();
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("-----INFORME O CÓDIGO DO PRODUTO:-----");
			System.out.println("-CÓDIGO 100 - CACHORRO QUENTE - R$3,50");
			System.out.println("-CÓDIGO 101 - SORVETE - R$1,50");
			System.out.println("-CÓDIGO 102 - HAMBURGUER - R$4,00");
			System.out.println("-CÓDIGO 103 - CHEESEBURGER - R$3,00");
			System.out.println("-CÓDIGO 104 - REFRIGERANTE - R$3,50");
			System.out.println("-OUTRA OPÇÃO PARA SAIR");
			lanche.setCodigo(scan.nextInt()); scan.nextLine();
			
			switch (lanche.getCodigo())
			{
			case 100:
				System.out.println("***100 - CACHORRO QUENTE - R$3,50 - ADICIONADO***");
				lanche.setValorConta( (lanche.getValorConta() + 3.50) );
				break;

			case 101:
				System.out.println("***101 - Sorvete - R$1,50 - ADICIONADO***");
				lanche.setValorConta( (lanche.getValorConta() + 1.50) );
				break;
				
			case 102:
				System.out.println("***102 - Hamburger - R$4,00 - ADICIONADO***");
				lanche.setValorConta( (lanche.getValorConta() + 4.00) );
				break;
				
			case 103:
				System.out.println("***103 - Cheeseburger - R$3,00 - ADICIONADO***");
				lanche.setValorConta( (lanche.getValorConta() + 3.00) );
				break;
				
			case 104:
				System.out.println("***104 - Refrigerante - R$3,50 - ADICIONADO***");
				lanche.setValorConta( (lanche.getValorConta() + 3.50) );
				break;
				
			default:
				System.out.println("FECHANDO A CONTA...");
				System.out.println("Valor final: " + lanche.getValorConta() );
				break;
			}
			
		} while (lanche.getCodigo() >= 100 && lanche.getCodigo() <= 104);
		
	}

}
