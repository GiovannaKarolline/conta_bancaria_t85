package conta_bancaria;

import conta_bancaria.util.Cores;
import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		while(true) {
			System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT  + Cores.TEXT_BLUE_BOLD+ "˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
			System.out.println("                            Banco                            ");                         
			System.out.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜" + Cores.TEXT_PURPLE_BOLD);
			System.out.println("                   1 - Criar conta                           ");
			System.out.println("                   2 - Listar todas as contas                ");
			System.out.println("                   3 - Buscar conta por número               ");
			System.out.println("                   4 - Atualizar dados da conta              ");
			System.out.println("                   5 - Apagar conta                          ");
			System.out.println("                   6 - Sacar                                 ");                   
			System.out.println("                   7 - Depositar                             ");                   
			System.out.println("                   8 - Transferir valores entre contas       ");
			System.out.println("                   0 - Sair                                  ");                   
			System.out.println(Cores.TEXT_BLUE_BOLD + "˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
			System.out.println("Digite a opção desejada:                                     ");
			}
		}
	}
