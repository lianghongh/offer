/**
*旋转数组的最小元素
*/

int findRotate(int[] nums)
{
    if(nums==null||nums.length==0)
        return -1;

    int p1=0;                        
    int p2=nums.length-1;
    int mid=p1;
    while (nums[p1]>=nums[p2])
    {
        if(p2-p1==1)
        {
            mid=p2;
            break;
        }
        mid=(p1+p2)>>1;
        if(nums[p1]==nums[p2]&&nums[p1]==nums[mid])
        {
            int t=nums[p1];
            for(int i=p1+1;i<=p2;i++)
            {
                if(nums[i]<t)
                {
                    t=nums[i];
                    mid=i;
                }
            }
            break;
        }

        if(nums[mid]>=nums[p1])
            p1=mid;
        else if(nums[mid]<=nums[p2])
            p2=mid;
    }
    return nums[mid];
}
