class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            int ans = 0;
            ans = (int)(Math.log10(nums[i]))+1;
            if(ans%2==0){
                count++;
            }
        }
        return count;
    }
}