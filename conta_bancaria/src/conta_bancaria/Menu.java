package conta_bancaria;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;
import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		Conta conta1 = new Conta(1, 123, 1, "Giovanna", 100.45f);
		Conta conta2 = new Conta(2, 123, 2, "Pedro", 25.00f);
		
		conta1.visualizar();
		conta2.visualizar();
		
		conta1.setSaldo(10000000.0f);
		
		conta1.visualizar();
		
		System.out.println("Sacar R$ 1.000,00 da conta 2: "+ (conta2.sacar(1000.00f) ? "Saque efetuado com sucesso." : "Saldo insuficiente."));
		
		conta2.depositar(50000.00f);
		
		conta2.visualizar();
		
		while(true) {
			System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT  + Cores.TEXT_BLUE_BOLD+ "˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
			System.out.println("                            Banco                            ");    
			System.out.println("                                                             ");
			System.out.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜" + Cores.TEXT_PURPLE_BOLD);
			System.out.println("                                                             ");
			System.out.println("                   1 - Criar conta                           ");
			System.out.println("                   2 - Listar todas as contas                ");
			System.out.println("                   3 - Buscar conta por número               ");
			System.out.println("                   4 - Atualizar dados da conta              ");
			System.out.println("                   5 - Apagar conta                          ");
			System.out.println("                   6 - Sacar                                 ");                   
			System.out.println("                   7 - Depositar                             ");                   
			System.out.println("                   8 - Transferir valores entre contas       ");
			System.out.println("                   0 - Sair                                  ");
			System.out.println("                                                             ");
			System.out.println(Cores.TEXT_BLUE_BOLD + "˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
			System.out.println("Digite a opção desejada:                                     ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_BLUE + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_BLUE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_BLUE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_BLUE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_BLUE + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_BLUE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_BLUE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_BLUE + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Giovanna Karolline");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
		}
	}
