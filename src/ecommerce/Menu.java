package ecommerce;

import java.util.Scanner;
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
		
		//a condição é true para que o loop seja infinito; será finalizado apenas se a opção 9 for digitada
		while (true) {
		
			//parte visual do Menu
			System.out.println("\n_______________________________________");
			System.out.println("\n\n            THAY ELETRÔNICOS            ");
			System.out.println("\n_______________________________________");
			System.out.println("\n           1.PRODUTOS DISPONÍVEIS       ");
			System.out.println("\n           2.ADICIONAR AO CARRINHO     ");
			System.out.println("\n           3.SOBRE NÓS             ");
			System.out.println("\n           4.FINALIZAR COMPRA           ");
			System.out.println("\n_______________________________________");
			System.out.println("\nDigite a opção desejada:         ");
			System.out.println("\n                                 ");
			
			opcao = leia.nextInt();
			
			//se a opção digitada for diferente de 4 (sair):
			if (opcao == 4) {
				System.out.println("\nVolte Sempre!");
			//objeto será finalizado
				leia.close();
			//programa será finalizado
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