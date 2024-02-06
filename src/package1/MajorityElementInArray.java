package package1;

public class MajorityElementInArray {

	public static void main(String[] args) {
		/*
		 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
		 * 
		 * Input: nums = [2,2,1,1,1,2,2]
             Output: 2
		 * 
		 */

		
		int [] nums = {2,2,1,1,1,2,2};
		int count=nums.length/2;
		for(int i=0;i<nums.length;i++) {
			int c=1; 
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					c++;
				}
			}
			if (c>count) {
				System.out.println(nums[i]);
			}
		}
		
	}

}
