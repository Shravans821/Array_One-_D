package array;

public class ArrayOneD {
	public static void main(String args[]) {
		int a[]=new int [] {2,4,1,2,3,1,2,4};
		//ArrayOp.print(a);
		ArrayOp p=new ArrayOp();
		System.out.println("Addition:"+p.add(a));
		System.out.println("Maximum:"+p.max(a));
		System.out.println("Minimum:"+p.min(a));
		ArrayOp.freqPrint(a);
	}
}
class ArrayOp{
	static void print(int a[]) {
		for(int x:a) {
			System.out.println(x);
		}
	}
	int add(int a[]) {
		int s=0;
		for(int x:a) {
			s+=x;	
		}	
		return s;
	}
	int max(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) 
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
		}
		return a[0];
	}
	int min(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) 
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
		}
		return a[0];
	}
	static void freqPrint(int a[]) {
		int b[]=new int [a.length];     //Array for storing the frequency of element.
		int visited=-1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;   //Avoiding the counting of same element.
				}
			}
			if(b[i]!=visited)
				b[i]=count;
		}
	System.out.println("Element - Frequency");
	for(int i=0;i<a.length;i++) {
		if(b[i] !=visited)
			System.out.println("     "+a[i]+"    "+b[i]);
	}

	}
	
	

}

