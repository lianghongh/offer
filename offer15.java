/**
*二进制中1的个数
*/


int count(int n)
{
    int count=0;
    while(n!=0)
    {
        count++;
        n=n&(n-1);
    }
    return count;
}