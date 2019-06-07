package questao06;

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		FiguraGeometrica fg = new FiguraGeometrica();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a figura geométrica:\n *-*-*-*-*-*-*-*-*-*-*-*-*\n" 
				+ " 1: Quadrado \n 2: Triângulo \n 3: Retângulo\n Outro valor para sair\n *-*-*-*-*-*-*-*-*-*-*-*-*\n");
		fg.setTipoFigura(scan.nextInt()); scan.nextLine();
		
		if (fg.getTipoFigura() == 1)
		{
			System.out.println("Informe o valor do lado do quadrado: ");
			fg.setAltura(scan.nextInt()); scan.nextLine();
			fg.setBase(fg.getAltura());
			System.out.println("A = b.h = " + fg.getAltura()*fg.getBase());
		}
			else if (fg.getTipoFigura() == 2) 
			{
				System.out.println("Informe o valor da base do triângulo: ");
				fg.setBase(scan.nextInt()); scan.nextLine();
				System.out.println("Informe o valor da altura do triângulo: ");
				fg.setAltura(scan.nextInt()); scan.nextLine();
				System.out.println("A = b.h = " + fg.getAltura()*fg.getBase());
			}
			else if (fg.getTipoFigura() == 3) 
			{
				System.out.println("Informe o valor da base do retângulo: ");
				fg.setBase(scan.nextInt()); scan.nextLine();
				System.out.println("Informe o valor da altura do retângulo: ");
				fg.setAltura(scan.nextInt()); scan.nextLine();
				System.out.println("A = b.h = " + fg.getAltura()*fg.getBase());
			}
			else 
			{
				System.out.println("Saindo...");
				return;
			}
	}
}
