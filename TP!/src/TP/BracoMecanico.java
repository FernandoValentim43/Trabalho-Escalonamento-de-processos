package TP;

public class BracoMecanico {
	int tipo;
	double time; //
	int caixas = 0;
	
	public BracoMecanico(int tipo) {
		 this.tipo = tipo;
	} 
	
	
	public void work(Produto Sorted[]) {
		for(Produto x: Sorted) {	
			
			caixas = (int) (caixas + x.caixas); 
	
			x.show(); //mostra informções do pedido
			x.execPedido(); //mostra tempo de empacotamento total do pedido
			x.whoMade(tipo); //mostra em qual esteira o pedido foi feito
			
			System.out.println(convertTime.secTomin( Math.round(caixas * 5.5))  + "\r\n"); //tempo total
			
		}
	}
	
	
	
	
}
