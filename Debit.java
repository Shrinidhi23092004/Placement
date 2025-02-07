public class Debit 
{
    public static void main(String[] args)
    {
        int A[]={900,1500,600,1200,400};
        int size=A.length;
        int count=0;
        int j=1;
        for(int i=0;i<size-1;i++)
        {
                if(A[i]>A[j])
                {
                    count++;
                }
                j++;
        }
        System.out.println("Debit Count :"+count);
    }
}
