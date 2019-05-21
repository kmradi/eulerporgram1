// project euler question 12, triangular number with no. of factors more than 500
public class peuler12
{
    public static void main(String args[])
    {
        int m = 1,n=0;
        int res=0;
        while(res<500)
        {
            m++;
            n = calcTriNum(m);
            res = calcFact(n);
        }
        System.out.println(n);
    }
    public static int calcTriNum(int m)
    {
        int tn;
        tn = m*(m+1)/2;
        return tn;
    }
    public static int calcFact(int n)
    {
        int nof=1,p=0,x=n;
        if(primeOrNot(n))
        {
            nof=2;
        }
        else
        {
            for(int i = 1;i <= n/2; i++)
            {
                if(i>3) //to skip even numbers after 2
                {
                    i++;
                }
                if(n%i==0&&primeOrNot(i))   //condition to filter out prime factors
                {
                
                    while (x%i==0)  //finding the powers of each prime factor
                    {
                        p++;
                        x=x/i;
                        //System.out.println(n+"  "+i+" "+p);
                    }
                
                }
                p+=1;
                nof*=p;
            
                p=0;
                x=n;
            }
        }
        System.out.println("no of factors ="+nof+"for "+n);
        return nof;
    }
    public static boolean primeOrNot(int i)
    {
        boolean truefalse=true;
        if((i%2==0&&i!=2)||i==1)
            truefalse = false;
        else
        {
            int sq = (int)(Math.sqrt(i));
            for(int a = 3;a <= sq; a+=2)
            {
                if(i%a==0)
                {
                    truefalse = false;
                    break;
                }
            }
        }
        return truefalse;
        
    }
}