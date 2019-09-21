class College_Q13
{
    public void main(int n,int x)
    {
        double sum=1.0;
        for(int i=1;i<n;i++)
        {
            sum=sum+(Math.pow(x,i)/fact(i))*Math.pow(-1,i);
        }
        System.out.println("Sum = "+sum);    
    }
    int fact(int n1)
    {
        int f=1;
        for(int i=1;i<=n1;i++)
        {
            f=f*i;
        }
        return f;
    }
    
}