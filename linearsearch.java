
import java.io.*;

public class linearsearch 
{
    public static int  linearSearch(int[] arr, int Key) 
    {
        for(int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == Key) 
            {
                return i;
            }
        }
        return -1;
    }
public static void main(String h[])throws IOException {
           
        int n[],a;
        n=new int[10];

            for(a=0;a<=9;a++)
            {
                System.out.println("Enter the number");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                n[a]=Integer.parseInt(br.readLine());
            }
            int Key = 30;
            int result = linearSearch(n, Key);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index: " + result);
        }
    }
    