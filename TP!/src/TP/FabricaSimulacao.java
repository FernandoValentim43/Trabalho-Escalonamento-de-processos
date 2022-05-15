package TP;
//FERNANDO V. VALENTIM PUC-MINAS
//Programa que simula o empacotamento dos produtos. O programa recebe o path(caminho) do arquivo txt. DEVE SER INSERIDO PELO USUÁRIO O CAMINHO QUE SE ENCONTRA O TXT
//O Programa le o arquivo, e baseado na padronização do mesmo; os ordena por menor-prazo-primeiro.






import java.io.*;
import java.util.Arrays;

public class FabricaSimulacao {
	public static void main(String args[]) throws FileNotFoundException {
        BracoMecanico Braco1 = new BracoMecanico(1);		
		
		//le o arquivo txt 
		Produto pedidos[] = reader.readFile("C:\\Users\\Hippo\\git\\Trabalho-Escalonamento-de-processos\\TP!\\pedidos.txt"); // <--- insira o caminho do arquivo txt de pedidos

		//ordena os pedidos. >>>>>>  PRAZO MAIS CURTO PRIMEIRO	<<<<<<<	
		Produto Sorted[] = sorter.sort(pedidos);

		//exebicição dos pedidos JA ORDENADOS feitos pelos braços mecanicos
		System.out.println("PEDIDOS: ");
		
		Braco1.work(Sorted);


	}

}
