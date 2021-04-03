//package leetcode;
//
//public class runningsum {
//	
//	public int[] runningSum(int[] nums) {	
//		
//		int[] jieguo = new int[nums.length];
//		
//		for(int k : jieguo) {
//			
//			k = 0;
//		}
//		
//		for(int j = 0; j < nums.length; j++) {
//			
//			for(int i = 0; i <= j; i++) {
//				
//				jieguo[j] += nums[i];
//			}
//			
//		}
//		
//		return jieguo;		
//	}
//	
//	public static void main(String[] args) {
//		
//		int[] shuru = {1,2,4,3};
//		
//		runningsum rs = new runningsum();
//		
//		shuru = rs.runningSum(shuru);
//		
//		for(int n : shuru) {
//			
//			System.out.println(n);
//		}
//	}
//}

class Solution {

    public int[] runningSum(int[] nums) {
        if(nums.length==0){
            return null;
        }
//        直接在原来的数组上动手脚，第一个元素不用动，所以for中i可以从1开始
		for(int i = 1;i<nums.length;i++) {
			nums[i] = nums[i-1]+nums[i];
		}
		//垃圾回收
        System.gc();
		return nums;
    }
}


