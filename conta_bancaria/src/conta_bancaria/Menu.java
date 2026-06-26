package conta_bancaria;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Menu {

	private static Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {

		int opcao = 0;

		criarContasTeste();

		/*
		 * Testes antigos: Conta conta1 = new Conta(1, 123, 1, "Giovanna", 100.45f);
		 * Conta conta2 = new Conta(2, 123, 2, "Pedro", 25.00f);
		 * 
		 * conta1.visualizar(); conta2.visualizar();
		 * 
		 * conta1.setSaldo(10000000.0f);
		 * 
		 * conta1.visualizar();
		 * 
		 * System.out.println("Sacar R$ 1.000,00 da conta 2: "+ (conta2.sacar(1000.00f)
		 * ? "Saque efetuado com sucesso." : "Saldo insuficiente."));
		 * 
		 * conta2.depositar(50000.00f);
		 * 
		 * conta2.visualizar();
		 * 
		 * ContaCorrente cc1 = new ContaCorrente(3, 789, 1, "Mariana", 123.45f,
		 * 20000.00f); cc1.visualizar();
		 * 
		 * System.out.println("Sacar R$ 1.000,00 da conta corrente 1: "+
		 * (cc1.sacar(1000.00f) ? "Saque efetuado com sucesso. Saldo: "+cc1.getSaldo() :
		 * "Saldo insuficiente."));
		 * System.out.println("Sacar R$ 1.000,00 da conta corrente 1: "+
		 * (cc1.sacar(300000.00f) ? "Saque efetuado com sucesso. Saldo: "+cc1.getSaldo()
		 * : "Saldo insuficiente."));
		 * 
		 * cc1.depositar(2000.00f); cc1.visualizar();
		 * 
		 * 
		 * ContaPoupanca cp1 = new ContaPoupanca(4, 908, 2, "Laura", 550.00f, 12);
		 * cp1.visualizar();
		 * listarContas();
		 */

		while (true) {
			System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_BLUE_BOLD
					+ "˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
			System.out.println("                            Banco                            ");
			System.out.println("                                                             ");
			System.out
					.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜" + Cores.TEXT_PURPLE_BOLD);
			System.out.println("                                                             ");
			System.out.println("                   1 - Criar conta                           ");
			System.out.println("                   2 - Listar todas as contas                ");
			System.out.println("                   3 - Buscar conta por número               ");
			System.out.println("                   4 - Atualizar dados da conta              ");
			System.out.println("                   5 - Apagar conta                          ");
			System.out.println("                   6 - Sacar                                 ");
			System.out.println("                   7 - Depositar                             ");
			System.out.println("                   8 - Transferir valores entre contas       ");
			System.out.println("                   9 - Listar contas por nome do titular     ");
			System.out.println("                   0 - Sair                                  ");
			System.out.println("                                                             ");
			System.out.println(Cores.TEXT_BLUE_BOLD + "˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
			System.out.println("Digite a opção desejada:                                     ");

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("Digite um número inteiro entre 0 e 8.");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_BLUE + "Criar Conta\n\n");
				cadastrarConta();
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_BLUE + "Listar todas as Contas\n\n");
				listarContas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_BLUE + "Consultar dados da Conta - por número\n\n");
				procurarContaPorNumero();
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_BLUE + "Atualizar dados da Conta\n\n");
				atualizarConta();
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_BLUE + "Apagar a Conta\n\n");
				deletarConta();
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_BLUE + "Saque\n\n");
				sacar();
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_BLUE + "Depósito\n\n");
				depositar();
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_BLUE + "Transferência entre Contas\n\n");
				transferir();
				keyPress();
				break;
			case 9:
				System.out.println(Cores.TEXT_BLUE + "Listar contas por titular\n\n");
				listarPorTitular();
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
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

	public static void criarContasTeste() {
		contaController.cadastrar(
				new ContaCorrente(contaController.gerarNumero(), 123, 1, "Duda", 1234567890.00f, 10000000000.00f));
		contaController
				.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 987, 2, "Magali", 1234567890.00f, 1));
	}

	public static void listarContas() {
		contaController.listarTodas();
	}

	public static void cadastrarConta() {

		System.out.print("Digite o número da agência: ");
		int agencia = leia.nextInt();

		System.out.print("Digite o nome do titular da conta: ");
		leia.skip("\\R");
		String titular = leia.nextLine();

		System.out.print("Digite o tipo de conta (1 para corrente, 2 para poupança): ");
		int tipo = leia.nextInt();

		System.out.print("Digite o saldo da conta: ");
		float saldo = leia.nextFloat();

		switch (tipo) {
		case 1 -> {
			System.out.print("Digite o limite da conta: ");
			float limite = leia.nextFloat();
			leia.skip("\\R");

			contaController
					.cadastrar(new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2 -> {
			System.out.print("Digite o dia de aniversário da conta: ");
			int diaAniversario = leia.nextInt();
			leia.skip("\\R");

			contaController.cadastrar(
					new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, diaAniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválido." + Cores.TEXT_RESET);
		}
	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.skip("\\R");
		leia.nextLine();
	}

	public static void procurarContaPorNumero() {
		System.out.println("Digite o número da conta:");
		int numero = leia.nextInt();

		contaController.procurarPorNumero(numero);
	}

	public static void deletarConta() {
		System.out.println("Digite o número da conta:");
		int numero = leia.nextInt();
		leia.skip("\\R");

		Optional<Conta> conta = contaController.buscarNaCollection(numero);

		if (conta.isPresent()) {

			System.out.printf("\nTem certeza que você deseja excluir a conta numero %d (S/N)?", numero);
			String confirmacao = leia.nextLine();

			if (confirmacao.equalsIgnoreCase("S")) {
				contaController.deletar(numero);
			} else {
				System.out.println("\nOperação cancelada!");
			}
		} else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}

	public static void atualizarConta() {
		System.out.println("Digite o número da conta:");
		// numero da conta
		int numero = leia.nextInt();
		leia.nextLine();

		Optional<Conta> conta = contaController.buscarNaCollection(numero);

		if (conta.isPresent()) {
			// dados atuais da conta com esse número
			// conta.get() pega a conta dentro do Optional
			int agencia = conta.get().getAgencia();
			String titular = conta.get().getTitular();
			int tipo = conta.get().getTipo();
			float saldo = conta.get().getSaldo();

			// atualiza o número de agência ou mantém
			System.out.printf("Agência atual: %d", agencia);
			System.out.println("Digite o novo número de agência (ou pressione ENTER para manter o valor atual):");
			String entrada = leia.nextLine();
			leia.skip("\\R");

			agencia = entrada.isEmpty() ? agencia : Integer.parseInt(entrada);

			// atualiza o nome do titular ou mantém
			System.out.printf("Titular atual: %s", titular);
			System.out.println("Digite o novo nome do titular (ou pressione ENTER para manter o valor atual):");
			entrada = leia.nextLine();
			leia.skip("\\R");

			titular = entrada.isEmpty() ? titular : entrada.trim();

			// atualiza o saldo da conta ou mantém
			System.out.printf("Saldo atual: %.2f", saldo);
			System.out.println("Digite o novo valor do saldo (ou pressione ENTER para manter o valor atual):");
			entrada = leia.nextLine();
			leia.skip("\\R");

			saldo = entrada.isEmpty() ? saldo : Float.parseFloat(entrada.replace(",", "."));

			switch (tipo) {
				case 1 -> {
					ContaCorrente contaCorrente = (ContaCorrente) conta.get();
					float limite = contaCorrente.getLimite();
	
					// atualiza o limite da conta corrente ou mantém
					System.out.printf("\nLimite atual: %.2f", limite);
					System.out.println("\nDigite o novo valor do limite (ou pressione ENTER para manter o valor atual):");
					entrada = leia.nextLine();
	
					limite = entrada.isEmpty() ? limite : Float.parseFloat(entrada.replace(",", "."));
	
					// função do controller que troca todos os valores de uma conta
					contaController.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					ContaPoupanca contaPoupanca = (ContaPoupanca) conta.get();
					int diaAniversario = contaPoupanca.getDiaDoAniversario();
	
					// atualiza o dia de aniversário da conta poupança ou mantém
					System.out.printf("\nLimite atual: %d", diaAniversario);
					System.out.println("\nDigite o novo dia de aniversário da conta (ou pressione ENTER para manter o valor atual):");
					entrada = leia.nextLine();
	
					diaAniversario = entrada.isEmpty() ? diaAniversario : Integer.parseInt(entrada);
	
					// função do controller que troca todos os valores de uma conta
					contaController.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, diaAniversario));
				} default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválido!" + Cores.TEXT_RESET);
			}
		}else {
			System.out.printf("\nA conta número %d não foi encontrada.", numero);
		}

	}
	
	public static void sacar() {
		System.out.println("Digite o número da conta:");
		int numero = leia.nextInt();
		
		System.out.print("Digite o valor do saque: ");
		float valor = leia.nextFloat();
		
		contaController.sacar(numero, valor);
	}
	
	public static void depositar() {
		System.out.println("Digite o número da conta:");
		int numero = leia.nextInt();
		
		System.out.print("Digite o valor do depósito: ");
		float valor = leia.nextFloat();
		
		contaController.sacar(numero, valor);
	}
	
	public static void transferir() {
		System.out.println("Digite o número da conta de origem:");
		int numeroOrigem = leia.nextInt();
		
		System.out.println("Digite o número da conta de destino:");
		int numeroDestino = leia.nextInt();
		
		System.out.print("Digite o valor da transferência: ");
		float valor = leia.nextFloat();
		leia.nextLine();
		
		contaController.transferir(numeroOrigem, numeroDestino, valor);
	}
	
	public static void listarPorTitular() {
		System.out.print("Digite o nome do titular da conta: ");
		String titular = leia.nextLine();
		
		contaController.listarPorTitular(titular);
	}
}
