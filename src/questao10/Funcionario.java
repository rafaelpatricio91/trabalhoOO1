package questao10;

//10) Utilize vetores de objetos em Java juntamente com o conceito de encapsulamento  para registrar as informações de uma 
//revendedora de carros. Sabe-se que esta paga aos seus funcionários dois salários mínimos (845 reais), 
//mais uma comissão fixa de R$ 50,00 por carro vendido e mais 5% do valor das vendas.  

public class Funcionario
{
	private String nome;
	private Double salario = (845.*2);
	private Integer carrosVendidos;
	private Double comissaoFixa=50.;
	private Double comissaoTotal=0.05;
	private Double totalReceber;
	private Double valorVenda;
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public Double getSalario()
	{
		return salario;
	}
	public void setSalario(Double salario)
	{
		this.salario = (845.*2);
	}
	public Integer getCarrosVendidos()
	{
		return carrosVendidos;
	}
	public void setCarrosVendidos(Integer carrosVendidos)
	{
		this.carrosVendidos = carrosVendidos;
	}
	public Double getComissaoFixa()
	{
		return comissaoFixa;
	}
	public void setComissaoFixa(Double comissaoFixa)
	{
		this.comissaoFixa = comissaoFixa;
	}
	public Double getComissaoTotal()
	{
		return comissaoTotal;
	}
	public void setComissaoTotal(Double comissaoTotal)
	{
		this.comissaoTotal = comissaoTotal;
	}
	public Double getTotalReceber()
	{
		return totalReceber;
	}
	public void setTotalReceber(Double totalReceber)
	{
		this.totalReceber = totalReceber;
	}
	public Double getValorVenda()
	{
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda)
	{
		this.valorVenda = valorVenda;
	}
	@Override
	public String toString()
	{
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", carrosVendidos=" + carrosVendidos
				+ ", comissaoFixa=" + comissaoFixa + ", comissaoTotal=" + comissaoTotal + ", totalReceber="
				+ totalReceber + ", valorVenda=" + valorVenda + "]";
	}
}
