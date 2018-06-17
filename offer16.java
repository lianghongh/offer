/*
*数值的整数次方
*/

double exp(double base,int expo)
{
    if(expo==0)
        return 1;
    else if(expo>0)
        return exp_t(base,expo);
    else
        return 1/exp_t(base,-expo);
}

double exp_t(double base,int expo)
{
    if(expo==0)
        return 1;
    double bb=exp_t(base,expo>>1);
    if((expo&1)==0)
        return bb*bb;
    else
        return bb*bb*base;
}