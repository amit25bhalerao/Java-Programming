import java.io.*;

public class JavaProgramShutdown
{
    public static void main(String args[]) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter No. Of Seconds After Which You Want Your Computer To Shutdown :");
        long a=Long.parseLong(br.readLine());

        Process proc = runtime.exec("shutdown -s -t " +a);

        System.exit(0);
    }
}