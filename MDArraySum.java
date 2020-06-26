public class MDArraySum
{
	public static void main(String[] args) {
		int[][] arr1 = {
		    {1,2,3},
		    {4,5,6},
		    {7,8,9}
		};
		int[][] arr2 = {
		    {1,2,3},
		    {4,5,6},
		    {7,8,9}
		};
		int[][] sum = new int[3][3];
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        sum[i][j] = arr1[i][j]+arr2[i][j];
		    }
		}
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        System.out.print(sum[i][j]+" ");
		    }
		    System.out.println();
		}
                         		    
		
	}
}
