class FirstNonRepeat
{
    public static void main(String[] args) 
        {
            boolean found;
            String str="customer";
            char result='\0';
            int size=str.length();
            for(int index=0;index<size-1;index++)
            {
                found=false;
                for(int j=index+1;j<size;j++)
                {
                    if(str.charAt(index)==str.charAt(j))
                    {
                        found=true;
                        break;
                    }
                }
                if(found==false)
                {
                    result=str.charAt(index);
                    break;
                }
            }
            if(result=='\0')
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(result);
            }
        }
}