package TP;

public class BracoMecanico {
	int tipo;
	
	public BracoMecanico(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	public void work(Produto Sorted[]) {
		for(Produto x: Sorted) {
			x.show();
			x.whoMade(tipo);
			
		}
	}
	
	
	
	
}
