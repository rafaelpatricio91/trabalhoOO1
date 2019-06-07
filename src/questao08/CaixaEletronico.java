package questao08;

import java.util.Scanner;

//Utilize vetores de objetos em Java juntamente com o conceito de encapsulamento para criar um programa que execute 
//as funcionalidades de uma conta corrente de uma pessoa. Cadastre o número da conta e o saldo. 
//Elabore as operações de depósito, sacar, consultar e transferir. Quando o saldo for negativo, 
//exiba a mensagem "Não há Saldo". Crie um programa utilizando duas classes uma para criar o objeto e 
//outra com as características, faça uso dos comandos, while, IF e Else.

public class CaixaEletronico
{
	public static void main(String[] args)
	{
		 ContaCorrente ccArray[] = new ContaCorrente[10];
		 Scanner scan = new Scanner(System.in);
		 ContaCorrente cc = new ContaCorrente();
		 int op;
		 
		 
		 System.out.println("Informe o número da conta: ");
		 cc.setNumero(scan.nextInt()); scan.nextLine();
		 System.out.println("Informe o saldo: ");
		 cc.setSaldo(scan.nextDouble()); scan.nextLine();
		 
		 for (int i = 0; i < 1; i++)
		{
			ccArray[i] = cc;
			System.out.println("***CONTA CADASTRADA!");
		}
		 
		 do
		{
			System.out.println("OPCAO 1 - DEPÓSITO");
			System.out.println("OPCAO 2 - SAQUE");
			System.out.println("OPCAO 3 - CONSULTA");
			System.out.println("OPCAO 4 - TRANSFERÊNCIA");
			System.out.println("OPCAO 5 - CADASTRAR NOVA CONTA");
			System.out.println("OUTRA OPÇÃO - SAIR");
			
			op = scan.nextInt(); scan.nextLine();
			
			switch (op)
			{
			case 1:
				System.out.println("Informe o valor a ser depositado: ");
				cc.setSaldo( (cc.getSaldo() + scan.nextInt() ) ); scan.nextLine();
				System.out.println("Novo Saldo: " + cc.getSaldo() );
				break;
				
			case 2:
				Double valor;
				System.out.println("Informe o valor a ser sacado: ");
				valor = scan.nextDouble(); scan.nextLine();
				
				if (valor > cc.getSaldo())
				{
					System.out.println("Saldo indisponível. Você possui "+cc.getSaldo()+".");
					System.out.println("Informe outro valor: ");
					valor = scan.nextDouble(); scan.nextLine();
				} else
				{
					cc.setSaldo( (cc.getSaldo() - valor ) );
					System.out.println("Retire o dinheiro... R$" + valor);
					System.out.println("Novo saldo: " + cc.getSaldo());
				}
				break;
				
			case 3:
				System.out.println("Seu saldo: " + cc.getSaldo());
				break;
				
			case 4:
				System.out.println("Função indisponível");
				break;
				
			case 5:
				
				
			default:
				break;
			}
			
		} while (op >= 1 && op <= 5);
		 
		 
	
	}
}
