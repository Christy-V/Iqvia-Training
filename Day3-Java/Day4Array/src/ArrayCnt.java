import java.util.Scanner;
public class ArrayCnt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to construct an array with 10 elements and to find the number of    
occurrences of each element in the Array.*/
		int arr[];
		Scanner sc=new Scanner(System.in);
		arr=new int[10];
		System.out.println("Enter 10 elements to the array");
		for (int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
        int [] freq = new int [10];  
        int k = -1;  
        
        for(int i = 0; i < 10; i++){  
            int cnt = 1;  
            for(int j = i+1; j <10; j++){  
                if(arr[i] == arr[j]){  
                    cnt++;  
                    freq[j] = k;  
                }  
            }  
            if(freq[i] != k)  
                freq[i] = cnt;  
        }  
        for(int i = 0; i < 10; i++){  
            if(freq[i] != k)  
                System.out.println(" element is :" + arr[i] + "  Count is : " + freq[i]);  
        }  

	}

}
