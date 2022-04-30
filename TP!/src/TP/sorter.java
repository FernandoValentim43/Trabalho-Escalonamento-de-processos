package TP;

public class sorter {
	public static obj[] sort(obj[] pedidos) {
		
		 int i =0;
		 int a = pedidos.length;
		
		 
		 
		 
    
	     //obtem os valores sem prazo 
	     int countZeros = 0;
	     for( i = 0 ; i < a ; i ++) {
	    	 if(pedidos[i].prz == 0) {
	    		 countZeros++;
	    	 }
	     }
	        
	        obj[] inp = GFG.bubbleSort(pedidos, a); //ordena eles por menor prazo primeiro
		  
	        
	        
	        if(countZeros == 0) {
	        	
	        	return inp;
	        	
	        	
	        	
	        } else {
	        	   obj[] with0 = new obj[countZeros];
	   	        obj[] no0 = new obj[a - countZeros];
	   	        if (countZeros > 0 && countZeros < a) {
	   	           
	   	            for ( i = 0; i < countZeros; i++) {
	   	                with0[i] = inp[i];
	   	            }
	   	         
	   	            for ( i = 0; i < a - countZeros; i++) {
	   	                no0[i] = inp[i + countZeros];
	   	            }
	   	 
	   	        }    
	   	 
	   	        //Os com prazo 0 são colocados ao final da lista
	   	        for( i  = 0; i < no0.length; i ++) {
	   	        	inp[i] = no0[i];
	   	        }
	   	        
	   	        for(i = 0; i < countZeros; i++) {
	   	        	inp[i + (a - countZeros)] = with0[i];
	   	        }
	   	        
	   		
	   		return inp;
	   		
	   	
	        }
	 
	}
}
