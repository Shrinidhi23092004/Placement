class SecondMin
{
    public static void main(String[] args)
    {
        double min=Integer.MAX_VALUE;
        double Number[]={12.5,9.2,4.5,19.5,2.5,56.8};
        int size=Number.length;
        for(int index=0;index<size;index++)
        {
            if(Number[index]<min)
            {
                min=Number[index];
            }
        }
       System.out.println( "First smallest :"+min);
        double second=Integer.MAX_VALUE;
        for(int index=0;index<size;index++)
        {
            if(Number[index]>min && Number[index]< second)
            {
                second=Number[index];
            }
        }
        System.out.println("Second smallest:"+second);
    }
}