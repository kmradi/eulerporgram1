//Add the 10 most significants only, compare with the previous value, 
//if same good else do for 11 digits and so on
import java.io.FileNotFoundException;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class peuler13
{
    //static String[] allnum = new String[100];
    public static void main(String args[]) throws FileNotFoundException
    {
        long t1,t2;
        String[] allnum = new String[100];
        File inp_file = new File("inp_peuler13.txt");
        Scanner sc = new Scanner(inp_file);
        int i=10;
        String s1="",s2="";
        for(int j=0;j<100;j++)
        {
            allnum[j]=sc.next();
        }
        t1=System.nanoTime();
        boolean watchman = true;
        while(watchman)
        {
            s1 = calcSum(i,allnum);
            watchman = !(s1.equals(s2));
            if(!(s1.equals(s2)))
            {
                s2=s1;
            }
            
            i+=2;           // getting the least avg time for i+2
        }
        t2=System.nanoTime();
        System.out.println(s1);
        long dif = t2-t1;
        System.out.println("elapsed time = "+dif+"ns");


    }
    public static String calcSum(int i,String all[])
    {
        String roster,chotastr;
        long sum=0;
        for(int j = 0; j< 100;j++)
        {
            chotastr = all[j].substring(0,i);
            sum = sum + Long.parseLong(chotastr);
        }
        roster = Long.toString(sum);
        roster = roster.substring(0,10); 
        return roster;
    }
}