package questao11;

public class Principal
{
	public static void main(String[] args)
	{
		Pessoa p = new Pessoa();
		PessoaService ps = new PessoaService();
		
		ps.cadastrarListar(p);
	}
	
	
}
