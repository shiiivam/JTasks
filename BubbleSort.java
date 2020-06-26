

public class BubbleSort
{
	public static void main(String[] args) {
	    int a;
		int[] arr = {23,4,3,47,14,5};
	
	for(int i=0;i<(arr.length-1);i++){
	    for(int j=0;j<(arr.length-1);j++){
	        if(arr[j+1]<arr[j]){
	            a = arr[j];
	            arr[j]=arr[j+1];
	            arr[j+1]=a;
	        }
	    }
	}
		
	   for(int ar: arr){
	        System.out.print(ar+" ");
	}
	System.out.println();
	for(int k=0;k<arr.length;k++){
	        System.out.print(arr[k]+" ");
	}
	}
}
