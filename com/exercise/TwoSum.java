package designpatternjava.com.exercise;

import java.util.Iterator;

public class TwoSum {

	
	public static void main(String[] args) {
		
		int arr[]=new int[]{2,7,11,15};
		TwoSum t=new TwoSum();
		int out[] = t.twoSum(arr, 26);
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
		
	}
	
	 public int[] twoSum(int[] nums, int target) {
		 
		 int arr[]=new int[2];
		 for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int sum=nums[i]+nums[j];
				if (target==sum) {
					arr[0]=i;
					arr[1]=j;
					return arr;
				}
			}
		}
		return arr;
	        
	    }
}
