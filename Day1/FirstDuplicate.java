public class FirstDuplicate 
{
    public static void main(String[] args)
    {
        int a[]={12,9,5,8,4,5,10,6,7,8};
        int size=a.length;
        int D=0;
        int k=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(a[i]==a[j])
                {
                    D=a[i];
                    k=1;
                    System.out.println("First Duplicate:"+D);
                    break;
                    
                }
            }
            if(k==1)
            {
                break;
            }
        }
    }
}