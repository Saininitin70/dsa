import java.io.*;
class day2
{
    void simple(int n[])
    {
        int a;
        int g = n[0];
    }
    public static void main (String h[]) throws IOException
    {
        int c=0;
        int n[],a;
        n=new int[10];
        day2 dd=new day2();
        for(a=0;a<=9;a++)
        {
            System.out.println("Enter the number");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            n[a]=Integer.parseInt(br.readLine());
        }
        dd.simple(n);

        System.out.println("Enter the number to search:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int searchNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < n.length; i++) {
            if (n[i] == searchNum) 
            {
                c++; 
            }}
        System.out.println("Number of times number entered: " +c);
        
}
}
    
