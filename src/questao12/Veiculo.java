package questao12;

public class Veiculo
{
	private String cor;
	private String modelo;
	private Integer portas;
	private String marca;
	private Double preco;
	
	public String getCor()
	{
		return cor;
	}
	public void setCor(String cor)
	{
		this.cor = cor;
	}
	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public Integer getPortas()
	{
		return portas;
	}
	public void setPortas(Integer portas)
	{
		this.portas = portas;
	}
	public Double getPreco()
	{
		return preco;
	}
	public void setPreco(Double preco)
	{
		this.preco = preco;
	}
	
	@Override
	public String toString()
	{
		return "Veiculo [cor=" + cor + ", modelo=" + modelo + ", portas=" + portas + ", marca=" + marca + ", preco="
				+ preco + "]";
	}
}
