/**
*数组中重复的数字
*
*在一个长度为n的数组中所有的数字都在0-n-1的范围内。
*数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
*/

boolean duplicate(int[] nums)
{
    if(nums==null||nums.length==0)
        return false;

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]<0||nums[i]>nums.length-1)
            return false;
    }

    for(int i=0;i<nums.length;i++)
    {
        while (nums[i]!=i)
        {
            if(nums[i]==nums[nums[i]])
                return true;
            int t=nums[i];
            nums[i]=nums[t];
            nums[t]=t;
        }
    }
    return false;
}