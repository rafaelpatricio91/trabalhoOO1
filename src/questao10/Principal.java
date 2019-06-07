package questao10;

public class Principal
{
	public static void main(String[] args)
	{
		Funcionario f = new Funcionario();
		FuncionarioService fs = new FuncionarioService();
		
		fs.cadastrarListar(f);
	}
}
