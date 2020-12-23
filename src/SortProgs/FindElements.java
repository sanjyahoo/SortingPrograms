package SortProgs;

public class FindElements {
	
	static void findMissing(int a[], int b[],  
            int n, int m) 
		{ 
			for (int i = 0; i < n; i++) 
		{ 
				int j; 
				for (j = 0; j < m; j++) 
					if (a[i] == b[j]) 
						break; 

				if (j == m) 
					System.out.print(a[i] + " "); 
				System.out.println("Coomit 1");
				System.out.println("Coomit 2");
				System.out.println("Coomit 3");
			
		} 
		} 


	public static void main(String[] args) {
		int a[]={2,3,5,7,8,0};
		int b[]={1,2,3,4,5};
		int n=a.length;
		int m=b.length;
		findMissing(a,b,n,m);
	}
}
