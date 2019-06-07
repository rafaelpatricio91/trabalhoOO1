package questao12;

public class Principal
{
	public static void main(String[] args)
	{
		VeiculoService vs = new VeiculoService();
		Veiculo v = new Veiculo();
		
		vs.cadastrarListar(v);
	}
}
