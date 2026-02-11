class Solution {
    public int removeDuplicates(int[] nums) {
       
        int k=1;
        nums[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}