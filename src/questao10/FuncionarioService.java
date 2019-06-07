package questao10;

import java.util.Scanner;


public class FuncionarioService
{
	int tamanho = 2;
	Funcionario[] funcionarios = new Funcionario[tamanho];
	Funcionario f = new Funcionario();
	private Scanner scan;
	
	public void cadastrarListar(Funcionario f)
	{
		for (int i = 0; i < funcionarios.length; i++)
		{
			funcionarios[i] = new Funcionario();
			
			scan = new Scanner(System.in);
			
			System.out.println("*~*~*~*~*~ CADASTRO DE VENDAS *~*~*~*~*~");
			
			System.out.println("Informe o nome: ");	
			funcionarios[i].setNome(scan.nextLine() );
			
			System.out.println("Informe o número de carros vendidos: ");	
			funcionarios[i].setCarrosVendidos(scan.nextInt() ); scan.nextLine();
			
			System.out.println("Informe o valor total da venda: ");	
			funcionarios[i].setValorVenda(scan.nextDouble() ); scan.nextLine();
			
			this.calculaComissaoFixa(funcionarios[i]);
			System.out.println("*CALCULA COMISSAO FIXA: "+ (funcionarios[i].getComissaoFixa() * funcionarios[i].getCarrosVendidos() ) );
			
			this.calculaComissaoTotal(funcionarios[i]);
			System.out.println("*CALCULA COMISSAO TOTAL: "+ (funcionarios[i].getComissaoTotal() * funcionarios[i].getValorVenda() ) );
			
			funcionarios[i].setTotalReceber(this.calculaVencimentoTotal(funcionarios[i]));
//			System.out.println(funcionarios[i].getTotalReceber() );
			
			this.calculaVencimentoTotal(funcionarios[i]);
			System.out.println("*CALCULA VENCIMENTO TOTAL: " + (this.calculaComissaoFixa(funcionarios[i]) + 
																this.calculaComissaoTotal(funcionarios[i]) + 
																funcionarios[i].getSalario()) );
			
			
			
			System.out.println("Venda cadastrada com sucesso!");
			System.out.println("Funcionário "+(i+1)+": " + funcionarios[i].toString());
			
		}	
		
//		System.out.println("TODOS AS PESSOAS:");
//		for (Funcionario funcionario : funcionarios)
//		{
//			System.out.println(funcionario.toString());
//		}
		
	}
	
	public Double calculaComissaoFixa(Funcionario f)
	{
		return (f.getComissaoFixa() * f.getCarrosVendidos() );
	}
	
	public Double calculaComissaoTotal(Funcionario f)
	{
		return (f.getValorVenda() * f.getComissaoTotal()) ;
	}
	
	public Double calculaVencimentoTotal(Funcionario f)
	{
		return (this.calculaComissaoFixa(f) + this.calculaComissaoTotal(f) + f.getSalario() );
	}
	
}
