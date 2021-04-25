import java.util.Scanner;

class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int arr[][];
		
		System.out.println("Enter the number of rows");
		int rows=Sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int columns=Sc.nextInt();
		arr =new int[rows][columns];
		for (int i =0;i<rows;i++) {
			for (int j =0;j<columns;j++) {
			System.out.println("Enter the element");
			arr[i][j]=Sc.nextInt();
			}
		}
		
		
		int arr1[][];
		
		System.out.println("Enter the number of rows");
		int rows1=Sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int columns1=Sc.nextInt();
		arr1 =new int[rows1][columns1];
		for (int i =0;i<rows1;i++) {
			for (int j =0;j<columns1;j++) {
			System.out.println("Enter the element");
			arr1[i][j]=Sc.nextInt();
			}
		}
		
		if (rows==rows && columns==columns1) {
			for (int i =0;i<rows1;i++) {
				for (int j =0;j<columns1;j++) {
				System.out.print(arr1[i][j]+arr[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		else {
			System.out.println("Sum not possible ");
		}
	}

}
