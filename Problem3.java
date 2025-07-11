import java.util.Scanner;
public class Problem3 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        if(a%2==0) 
        {
            a=a-1;
        }
        for(int i=1,count=0;count<a;i+=2)
        {
            System.out.print(i);
            count++;
            if(count<a) 
            {
                System.out.print(", ");
            }
            if(count%10==0) 
            {
                System.out.println();
            }
        }
        sc.close();
    }
}

