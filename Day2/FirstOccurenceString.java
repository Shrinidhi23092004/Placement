class FirstOccurenceString
{
    public static void main(String[] args)
    {
        int count;
        String txt="GeeksForGeeks";
        String pat="For";
        boolean found = false;
        for(int i=0;i<=txt.length()-pat.length();i++)
        {
            count = 0;
            for(int j=0;j<pat.length();j++)
            {
                if((txt.charAt(i+j) == pat.charAt(j))){
                    count++; 
                }
            }
            if(count == pat.length()){
                System.out.println("String occur at:"+i);
                found = true; 
                break;
            }
        }
        if(!found)
        {
            System.out.println("-1");
        }
    }
}