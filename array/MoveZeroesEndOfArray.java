package array;

public class MoveZeroesEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,0,0,0,0,2,21,0,90,0,8,90,00,89,0};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp=arr[i];
				for(int j=i;j<arr.length-1;j++) {
					if(j<=arr.length-1) {
				arr[j]=arr[j+1];
					} 
				}
				arr[arr.length-1]=temp;
			}
			if(arr[0]==0) i--;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
