package TP;

import java.io.*;
import java.util.Arrays;

public class Model {
	public static void main(String args[]) throws FileNotFoundException {
		//le o arquivo txt
		obj pedidos[] = reader.readFile("C:\\Users\\Hippo\\git\\Trabalho-Escalonamento-de-processos\\TP!\\pedidos.txt"); //insira o caminho do arquivo txt de pedidos
		
        //ordena os pedidos. PRAZO MAIS CURTO PRIMEIRO		
		
		
		obj Sorted[] = sorter.sort(pedidos);
		
		for(int i = 0; i < pedidos.length ; i++) {
		    Sorted[i].show();
		} 

	}
	
}
