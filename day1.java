import java.io.*;
class day1
{
   void simple(int n[])
    {
        int a;
        int g = n[0];
    }
public static void main(String h[] ) throws IOException
    { 
        
    int n[],a;
    n=new int[10];


    day1 dd=new day1();
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
    boolean found = false;

    for (int i = 0; i < n.length; i++) {
        if (n[i] == searchNum) {
            found = true;
            System.out.println("Number found at index: " + i);
            break;
        }
    }

    if (!found) {
        System.out.println("Number not found in the array.");
    }
    for(a=0;a<=9;a++)
    {
        System.out.println(n[a]);
    }
}
}