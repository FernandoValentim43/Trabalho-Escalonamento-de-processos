package TP;
//FERNANDO V. VALENTIM PUC-MINAS
//O programa recebe um txt contento o numero de pedidos, seguido pelos pedidos propriamente, no modelo nome + quantia + prazo. O programa le esse arquivo txt de lista de pedidos
//e devolve um array JA ORDENADO por MENOR PRAZO PRIMEIRO de todos os pedidos




import java.io.*;
import java.util.Arrays;

public class Model {
	public static void main(String args[]) throws FileNotFoundException {
		//le o arquivo txt
		obj pedidos[] = reader.readFile("C:\\Users\\Hippo\\git\\Trabalho-Escalonamento-de-processos\\TP!\\pedidos.txt"); //insira o caminho do arquivo txt de pedidos
		
        //ordena os pedidos. PRAZO MAIS CURTO PRIMEIRO		
		
		
		obj Sorted[] = sorter.sort(pedidos);
		
		//exebicição do array
		for(int i = 0; i < pedidos.length ; i++) {
		    Sorted[i].show();
		} 

	}
	
}
