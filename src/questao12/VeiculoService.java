package questao12;

import java.util.Scanner;

public class VeiculoService
{
	int tamanho = 3;
	Veiculo[] veiculos = new Veiculo[tamanho];
	private Scanner scan;
	
	public void cadastrarListar(Veiculo v)
	{
		for (int i = 0; i < veiculos.length; i++)
		{
			veiculos[i] = new Veiculo();
			
			scan = new Scanner(System.in);
			
			System.out.println("*~*~*~*~*~ CADASTRO DE VEÍCULOS *~*~*~*~*~");
			
			System.out.println("Informe a cor: ");	
			veiculos[i].setCor(scan.nextLine() );
			
			System.out.println("Informe o modelo: ");	
			veiculos[i].setModelo(scan.nextLine() );
			
			System.out.println("Informe o número de portas: ");	
			veiculos[i].setPortas(scan.nextInt() ); scan.nextLine();
			
			System.out.println("Informe a marca: ");	
			veiculos[i].setMarca(scan.nextLine() );
			
			System.out.println("Informe o preço: ");	
			veiculos[i].setPreco(scan.nextDouble() ); scan.nextLine();
			
			System.out.println("Veículo "+(i+1)+": " + veiculos[i].toString());
		}	
		
		System.out.println("TODOS OS VEICULOS:");
		for (Veiculo veiculo : veiculos)
		{
			System.out.println(veiculo.toString());
		}
		
	}
		
}
