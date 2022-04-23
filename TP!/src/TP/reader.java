package TP;
import java.util.*;

import org.w3c.dom.NameList;

import java.io.*;


public class reader {
	public static obj[] readFile(String fileName) {
	    try {
	    
	        //reader
	    	BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line = reader.readLine();  //le a primeira linha que contem a quantidade de pedidos
            int pedidosNum = Integer.parseInt(line);
            
            
            //array de pedidos
            obj listaPedidos[] = new obj[pedidosNum];
          
           
            //le linha a linha do arquivo e cria objetos com os dados
            String strLine;
            for(int i = 0; i < pedidosNum ; i ++) {
                strLine = reader.readLine();
                String[] aux = strLine.split(";");
                
                String a = aux[0];
                int b = Integer.parseInt(aux[1].replaceAll("\\s", ""));
                int c = Integer.parseInt(aux[2].replaceAll("\\s", ""));
                
                listaPedidos[i] = new obj(a,b,c);
     
            }
          
           

	        reader.close();
	        return listaPedidos;
	        
	       
	    } catch (IOException ex) {
	        System.out.println("Problems..");
	    }
	    return (obj[]) null;
	}
  
}
