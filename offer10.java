/**
*求fabonacci数列的第n项
*/

//dp
int Fibonacci(int n)
{
    if(n<0)
        return -1;
    int[] fa=new int[n+1];
    fa[0]=0;
    fa[1]=1;
    for(int i=2;i<=n;i++)
        fa[i]=fa[i-1]+fa[i-2];
    return fa[n];
}


//尾递归，调用Fibonacci(n,0,1)
int Fibonacci(int n,int a,int b)
{
    if(n==0)
        return a;
    if(n==1)
        return b;
    return Fibonacci(n-1,b,a+b); 
}

