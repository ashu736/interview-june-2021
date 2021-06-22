package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    int n=1;
		for(int i = 0; i < n; i++)
		{    
            int j, last;    
            last = arr[arr.length-1];   
            for(j = arr.length-1; j > 0; j--)
            {    
                arr[j] = arr[j-1];    
            }    
            arr[0] = last;    
     } 
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
  }

}
