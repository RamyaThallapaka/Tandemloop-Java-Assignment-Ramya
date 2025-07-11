import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input values:");
        String input=sc.nextLine();
        String[] n =input.split(" ");
        int[] arr=new int[n.length];
        for(int i=0;i<n.length;i++) 
        {
            arr[i] = Integer.parseInt(n[i]);
        }
        int[] count=new int[10]; 
        for(int i=0;i<arr.length;i++) 
        {
            int num=arr[i];
            for(int j=1;j<=9;j++) 
            {
                if (num%j==0) 
                {
                    count[j]++;
                }
            }
        }
        System.out.print("{");
        for (int i=1;i<=9;i++)
         {
            System.out.print(i+": "+count[i]);
            if(i!=9) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        sc.close();
    }
}
