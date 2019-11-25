package programs.probsolv.array;

public class LargestSumSubArray {
	
	int[] arr = {-2,-3,-4,-1,-2,-1,-5,-3};
	
	public static void main(String args[]) {
		
		LargestSumSubArray lss =new LargestSumSubArray();
		
		System.out.println(lss.largestSumSubArray());
		
		
		
	}
	
	
	public int largestSumSubArray() {		
		
		
		int maxSumSubArray=-10000000;
		
		
		for(int j=0;j<arr.length;j++) { //size of sub array starting from 1 to n
			
			for(int i=0;i<arr.length;i++) {
				
				 int newsumSubArray=sumOfSubArray(i,i+j);
				 if(newsumSubArray>maxSumSubArray)
					 maxSumSubArray=newsumSubArray;
			
		    }
		
			
			
			
		}
		
		return maxSumSubArray;
		
		
	}
	
	
	private int sumOfSubArray(int start,int end) {
		
		if(end>=arr.length)
			end=arr.length-1;
		
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=arr[i];
			
		}
		
		return sum;
		
	}
	

}
