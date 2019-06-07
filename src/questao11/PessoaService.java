package questao11;

import java.util.Scanner;

public class PessoaService
{
	int tamanho = 3;
	Pessoa[] pessoas = new Pessoa[tamanho];
	private Scanner scan;
	
	public void cadastrarListar(Pessoa p)
	{
		for (int i = 0; i < pessoas.length; i++)
		{
			pessoas[i] = new Pessoa();
			
			scan = new Scanner(System.in);
			
			System.out.println("*~*~*~*~*~ CADASTRO DE PESSOAS *~*~*~*~*~");
			
			System.out.println("Informe o nome: ");	
			pessoas[i].setNome(scan.nextLine() );
			
			System.out.println("Informe o CPF: ");	
			pessoas[i].setCpf(scan.nextLine() );
			
			System.out.println("Informe o RG: ");	
			pessoas[i].setRg(scan.nextLine() );
			
			System.out.println("Informe o telefone: ");	
			pessoas[i].setTel(scan.nextLine() );
			
			System.out.println("Informe o salário: ");	
			pessoas[i].setSalario(scan.nextDouble() ); scan.nextLine();
			
			System.out.println("Informe a data de admissão: ");	
			pessoas[i].setDataAdmissao(scan.nextLine() );
			
			System.out.println("Informe o horário de trabalho: ");	
			pessoas[i].setHorario(scan.nextLine() );
			
			System.out.println("Pessoa cadastrada com sucesso!");
			System.out.println("Veículo "+(i+1)+": " + pessoas[i].toString());
		}	
		
		System.out.println("TODOS AS PESSOAS:");
		for (Pessoa pessoa : pessoas)
		{
			System.out.println(pessoa.toString());
		}
		
	}
		
}
