

public class FinalArrayExample { 
	
	public static void main(String[]args) {		
	final int arr[]= {13,78,5,37,90,22}; 
	final int a=30; 
	final int arr1[]= {90,56,3,89,56};
	arr[0]=11; //a=20;

//arr=arr1;

int x[]= {1,2,3}; int y[]= {10,9,8}; x=y;

arr[0]=67; arr1[2]=66;

for(int i=0;i<arr.length;i++)

{

System.out.print(arr[i]+" ");

}

for(int i=0;i<arr1.length;i++) {

System.out.print(arr1[i]+" ");

}

}

}
