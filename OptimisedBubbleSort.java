public class OptimisedBubbleSort
{
	public static void main(String[] args) {
	 boolean sorted = true;
	 int i,j,temp,n;
	 int[] arr = {0,9,7,2,6};
     n = arr.length;	
	 for(i=0;i<n-1;i++){
	     for(j=0;j<n-1-i;j++){
	         if(arr[j+1]<arr[j]){
	             temp = arr[j];
	             arr[j] = arr[j+1];
	             arr[j+1] = temp;
	             sorted = false;
	         }
	     }
	     if(sorted){
	         break;
	     }
	     
	     }
	     for (int k=0;k<n;k++){
	         System.out.print(arr[k]+" ");
	 }
	}
}
