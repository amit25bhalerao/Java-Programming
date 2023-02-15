public class Equality
{
    void equality(int a[][],int n1,int m1,int b[][],int n2,int m2)
    {
        if((n1!=n2)&&(m1!=m2))
        {
            System.out.println("Number Of Rows And Number Of Columns In Both Matrices Arent Same. Hence Matrices Dont Staisfy Equality Condition.");
            System.exit(0);
        }

        int res=0;

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                if(a[i][j]==b[i][j])
                {
                    res=1;
                }
                else
                {
                    res=0;
                    break;
                }
            }
        }

        if(res==1)
        {
            System.out.println("Both Matrices Satisfy The Equality Condition");
        }
        else
        {
            System.out.println("Both Matrices Dont Satisfy The Equality Condition");
        }
    }
}
