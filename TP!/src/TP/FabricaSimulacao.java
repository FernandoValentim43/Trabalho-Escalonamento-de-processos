package TP;
//FERNANDO V. VALENTIM PUC-MINAS
//Programa que simula o empacotamento dos produtos. O programa recebe o path(caminho) do arquivo txt. DEVE SER INSERIDO PELO USU�RIO O CAMINHO QUE SE ENCONTRA O TXT
//O Programa le o arquivo, e baseado na padroniza��o do mesmo; os ordena por menor-prazo-primeiro.

import java.io.*;
import java.util.Arrays;

public class FabricaSimulacao {
	public static void main(String args[]) throws FileNotFoundException {
        BracoMecanico Braco1 = new BracoMecanico(1);	
        BracoMecanico Braco2 = new BracoMecanico(2);		
    
		//le o arquivo txt 
		Produto pedidos[] = reader.readFile("C:\\Users\\Hippo\\git\\Trabalho-Escalonamento-de-processos\\TP!\\pedidos.txt"); // <--- insira o caminho do arquivo txt de pedidos

		//separa metade dos pedidos 
		Produto pedidosEven[] = sorter.sortEven(pedidos);
		Produto pedidosOdds[] = sorter.sortOdds(pedidos);

		//ordena os pedidos. >>>>>>  PRAZO MAIS CURTO PRIMEIRO	<<<<<<<	
		Produto OrdenedA[] = sorter.sort(pedidosEven);
		Produto OrdenedB[] = sorter.sort(pedidosOdds);

		
		//exebici��o dos pedidos JA ORDENADOS feitos pelos bra�os mecanicos
		System.out.println("PEDIDOS: " + "\r\n");
		
		Braco1.work(OrdenedA);
		Braco2.work(OrdenedB);

	}

}
