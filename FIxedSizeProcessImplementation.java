
public class FIxedSizeProcessImplementation {
	
	public static  void fixedSize(int bs[],int m,int ps[],int n)
	{
		int allocated[] = new int[n];
		for(int i=0;i<allocated.length;i++)
			allocated[i] = -1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(bs[j] >= ps[i])
				{
					allocated[i] = j;
					bs[j] = bs[j] - ps[i];
					break;
				}
			}
		}
		System.out.println("\nProcessNumber\tProcessSize\tBlockNumber");
		for(int i=0;i<n;i++)
		{
			System.out.print( i+1+ "\t\t"+ps[i]+"\t\t");
			if(allocated[i]!=-1)
				System.out.println(allocated[i]+1);
			else
				System.out.println("Not alllocated");
		}
	}
		
	
	public static void main(String[] args) {
		
		int blockSize[] = {100,500,200,300,600};
		int processSize[] = {212,417,112,426};
		int n= blockSize.length;
		int m = processSize.length;
		fixedSize(blockSize, n, processSize, m);
				
	}

}
