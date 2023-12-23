package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;

import java.text.NumberFormat;
import ecommerce.controller.MenuController;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		MenuController loja = new MenuController();

		int opcao;
		int pedido = 0, quantidade;
		float preco = 0;
		
		while (true) {
		
			//parte visual do Menu
			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND
					+ "\n 🎧💻📱🎧💻📱🎧💻📱🎧💻📱🎧💻📱🎧💻📱🎧💻📱🎧💻📱🎧💻");
			System.out.println("                                                     ");
			System.out.println("                 THAY ELETRÔNICOS  ©                 ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("      ♦     1.PRODUTOS DISPONÍVEIS                   ");
			System.out.println("      ♦     2.ADICIONAR AO CARRINHO                  ");
			System.out.println("      ♦     3.SOBRE NÓS                              ");
			System.out.println("      ♦     4.FINALIZAR COMPRA                       ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("Digite uma opção:                                    ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if (opcao == 4) {
				System.out.println("\nObrigado por comprar com a THAY ELETRÔNICOS, volte Sempre!");
				{
					System.out.println("\n_______________________________________________________");
					System.out.println("Projeto Desenvolvido por:                              ");
					System.out.println("Thayná Vieira Barreto - thaybarreto@live.com           ");
					System.out.println("github.com/thaybrrt                                    ");
					System.out.println("_______________________________________________________");
				   }
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\nPRODUTOS: ");
				
				loja.descricaoProdutos();
				
				loja.mostrarProdutos();
				
				break;
				
			case 2: {
				System.out.println("Faça seus pedidos:");

                float total = 0;

                loja.listarProdutos();
				
				char resposta='S';
				
				while (resposta != 'N') {
					
	
					System.out.println("\nDigite o número do Produto: ");
				pedido = leia.nextInt();
                
				System.out.println("\nQuantas Unidades Você Deseja? ");
				quantidade = leia.nextInt();
				System.out.println("\nDeseja continuar comprando? S/N" );
				resposta = leia.next().toUpperCase().charAt(0);
				float valorItem = 0;
				
				switch (pedido) {
				
		            case 1:
		                valorItem = quantidade * 12.599f;
		                break;
		            case 2:
		                valorItem = quantidade * 23.600f;
		                break;
		            case 3:
		                valorItem = quantidade * 1.099f;
		                break;
		            case 4:
		                valorItem = quantidade * 4.449f;
		                break;
		            case 5:
		                valorItem = quantidade * 4.599f;
		                break;
		            default:
		                System.out.println("\nOpção Inválida!");
		                continue; 
		        }
		        total += valorItem;
		    }
		                
				System.out.printf("\nTotal da Compra: R$ %.3f\n", total);
            
            }
                
		break;	
			case 3: {
				loja.sobreNos();
			}
				break;

			default:
				System.out.println("\nOpção Inválida!");
				break;
	}
}
}
}