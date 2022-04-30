package TP;

public class GFG {
	//ordena os valores por MENOR PRAZO PRIMEIRO(incluindo com prazo 0)
    static obj[] bubbleSort(obj arr[], int n)
    {
        int i, j;
        obj temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j].prz > arr[j + 1].prz)
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
          
            if (swapped == false)
                break;
        }
		return arr;
    }
 
}
