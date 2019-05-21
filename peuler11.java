import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;
public class peuler11
{ 
    public static void main(String[] args) throws FileNotFoundException
    { 
        
        int A[][]=new int[20][20];
        File inpfile = new File("inppeuler11.txt");
        Scanner sc = new Scanner(inpfile);
        int i=0,j=0;
        while(i!=20)
        {
            A[i][j]=sc.nextInt();
            System.out.print(A[i][j]+" ");
            j++;
            
            if(j==20)
            {
                j=0;
                i++;
                System.out.println();
            }
        } 
        int ans=0;
        int max=A[0][0];
        
        for( i =0;i<20;i++)
        {
            for( j=0;j<20;j++)
            {
                //horizontal
                if(j+3<20)
                {
                    ans=A[i][j]*A[i][j+1]*A[i][j+2]*A[i][j+3];
                    
                    if(ans>max)
                    {
                        max=ans;
                    }
                }
                //veritcal
                if(i+3<20)
                {
                    ans = A[i][j]*A[i+1][j]*A[i+2][j]*A[i+3][j];
                   
                    if(ans>max)
                    {
                        max=ans;
                    }
                }
                //diagonal
                if(i+3<20&&j+3<20)
                {
                    ans = A[i][j]*A[i+1][j+1]*A[i+2][j+2]*A[i+3][j+3];
                    if(ans>max)
                    {
                        max=ans;
                    }
                }
                if(i-3>=0&&j+3<20)
                {
                    ans = A[i][j]*A[i-1][j+1]*A[i-2][j+2]*A[i-3][j+3];
                    if(ans>max)
                    {
                        max=ans;
                    }
                }
            }
        }
        System.out.println(max);
        
    }
}