package TP;

public abstract class Produto {
	String name = null;  //nome do cliente 
	int qdt = 0;   //quantidade de produtos
	int prz = 0;   //prazo de entrega
	int dtChegada;  // horario de chegada do pedido
	int esteira; // qual dos bracos mecanicos fez o pedido
	boolean prize; //se o produto é marcado como priotirario*


	public Produto(String a, int b, int c, int d) {
		this.name = a;
		this.qdt = b;
		this.prz = c;
		this.dtChegada = d;
	}

	public void show() {
		System.out.println("NOME CLIENTE: " + this.name);
		System.out.println("QUANTIDADE DE PROTUDOS: " + this.qdt);
		System.out.println("PRAZO DE ENTREGA: " + this.prz);
		System.out.println("HORARIO DE CHEGADA DO PEDIDOS: " + this.dtChegada );

	}
 
	
	
	public void whoMade(int x) {   //seta qual braco mecanico ficou responsavel pelo pedido
		this.esteira = x;
		System.out.println("BRAÇO MECANICO RESPONSAVEL [" + esteira + "]"  + "\r\n" );
	}
}
