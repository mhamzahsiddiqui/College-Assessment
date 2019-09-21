class College_Q14
{
    public static void main(int n)
    {
        String ze="ZERO",on="ONE",tw="TWO",th="THREE",fo="FOUR",fi="FIVE";
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            System.out.print(ze+" ");
            else if(s.charAt(i)=='1')
            System.out.print(on+" ");
            else if(s.charAt(i)=='2')
            System.out.print(tw+" ");
            else if(s.charAt(i)=='3')
            System.out.print(th+" ");
            else if(s.charAt(i)=='4')
            System.out.print(fo+" ");
            else if(s.charAt(i)=='5')
            System.out.print(fi+" ");
        }        
    }
}