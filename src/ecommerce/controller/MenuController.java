package ecommerce.controller;

import ecommerce.model.Produtos;
import java.util.ArrayList;
import ecommerce.repository.MenuRepository;

public class MenuController implements MenuRepository {
	
	public ArrayList<Produtos> Lista;
	
	@Override
	public void descricaoProdutos() {
		ArrayList<Produtos> Produtos = new ArrayList<Produtos>();
	
	Produtos.add(new Produtos ("Iphone 15 PRO MAX 1TB","Forjado em titânio e com o incomparável chip A17 Pro, botão de Ação configurável e o sistema de câmera mais poderoso em um iPhone.",12.599,"Smartphones"));
	Produtos.add(new Produtos ("MacBook Pro 16","Chip M2 Pro da Apple com CPU de 12 núcleos e GPU de 19 núcleos, de 512GB SSD - Cinza Espacial",23.600,"MacBook PRO"));
	Produtos.add(new Produtos ("Apple AirPods (2ª geração)com Estojo de Recarga Lightning","É só tirar do estojo de recarga sem fio e colocar no ouvido que eles se conectam imediatamente, envolvendo você em um mundo de som de alta qualidade.",1.099,"AirPods"));
	Produtos.add(new Produtos ("Apple iPad (10ª geração, Wi-Fi, 64GB)","Tela Liquid Retina de 10,9 polegadas com design de ponta a ponta colorido◊Consultar avisos legais. Compatível com acessórios indispensáveis, como o novo Magic Keyboard Folio e o Apple Pencil (1ª geração).",4.449,"Ipads"));
	Produtos.add(new Produtos ("IPhone 13 256GB","Uma tela superbrilhante projetada para ser resistente. Faz vídeos com qualidade de cinema. Seu chip tem uma velocidade impressionante. E ganhou um aumento notável em bateria.",4.599,"Smartphones"));
	Lista = Produtos;
	}
	
	@Override
	public void mostrarProdutos() {
		
		for(Produtos i: Lista) {
			i.mostrarDetalhes();
		}
				
	}
	
	@Override
	public void listarProdutos() {
		System.out.println("Selecione o produto que deseja comprar");
		System.out.println("\nPRODUTOS");
		System.out.println("1\tIphone 15 PRO MAX 1TB" + " Preço: R$ 12,599");
		System.out.println("2\tMacBook Pro 16" + " Preço: R$ 23,600");
		System.out.println("3\tApple AirPods (2ª geração)com Estojo de Recarga Lightning" + " Preço: R$ 1,099");
		System.out.println("4\tApple iPad (10ª geração, Wi-Fi, 64GB" + " Preço: R$ 4,449");
		System.out.println("5\tIPhone 13 256GB" + " Preço: R$ 4,599");
	}
	
	@Override
	public void sobreNos() {
		
		System.out.println("\nSOBRE NÓS: ");
		System.out.println("\nOlá, bem-vindos a THAY ELETRÔNICOS, sua loja online de tecnologia! ");
		System.out.println("Oferecemos produtos de última geração, uma experiência personalizada de compra e compromisso com a qualidade. ");
		System.out.println("Conecte-se à nossa comunidade tecnológica e descubra inovações líderes do setor.  ");
		System.out.println("Escolha THAY ELETRÔNICOS para uma jornada única no universo da tecnologia! ");
	}
}