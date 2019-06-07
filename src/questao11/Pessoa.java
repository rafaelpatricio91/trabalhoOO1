package questao11;

//11) Um mercado te contratou para fazer o cadastro de sua folha de funcionários. Utilize vetores de objetos em Java 
//juntamente com o conceito de encapsulamento para registrar os dados pessoais de cada funcionário 
//(Nome, Cpf, RG, telefone, salário, data de admissão, horário de trabalho).

public class Pessoa
{
	private String nome;
	private String cpf;
	private String rg;
	private String tel;
	private Double salario;
	private String dataAdmissao;
	private String horario;
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getCpf()
	{
		return cpf;
	}
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	public String getRg()
	{
		return rg;
	}
	public void setRg(String rg)
	{
		this.rg = rg;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public Double getSalario()
	{
		return salario;
	}
	public void setSalario(Double salario)
	{
		this.salario = salario;
	}
	public String getDataAdmissao()
	{
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao)
	{
		this.dataAdmissao = dataAdmissao;
	}
	public String getHorario()
	{
		return horario;
	}
	public void setHorario(String horario)
	{
		this.horario = horario;
	}
	
	@Override
	public String toString()
	{
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", tel=" + tel + ", salario=" + salario
				+ ", dataAdmissao=" + dataAdmissao + ", horario=" + horario + "]";
	}
}
