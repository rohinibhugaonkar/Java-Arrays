class Solution {
    public int[] twoSum(int[] nums, int target) {
       	int [] output= new int[2];
		int item1= 0, item2=0;
		int temp = 0;
		for(int j = 0; j <nums.length;j++) {
			item1 = nums[j];
			for (int k =j+1;k<nums.length;k++) {
				
				item2 = nums[k];
			
				temp = item1+ item2;
				if(temp == target) {
				output[0] =  j;
				output[1] =  k;
				return output;
				
				}
			}
			
		}
		
		
		return output;
    }
    
    	public static void main(String[] args) {

	
		int n;
		int target = 0;
		
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		
		n=sc.nextInt();  
		 
		int num[] = new int [5];
		
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		num[i]=sc.nextInt();  
		}  
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the target as sum of two "); 
		try {
			target = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	int out[] = null;
		Solution obj = new Solution();
		out = obj.twoSum(num, target);
		
		System.out.println(Arrays.toString(out));
	}
}
