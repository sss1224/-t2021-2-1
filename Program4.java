import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []series= {1,2,3,4,5,6,7,8,9};
        int []input=new int[100];
        int []count= new int[series.length];
        System.out.println("enter no. of elements in input");
        int n=scanner.nextInt();
        System.out.println("enter elements");
        for(int i=0;i< n;i++)
        {
            input[i]=scanner.nextInt();
        }
        for(int j=0;j< n;j++)
        {
            for(int i=0;i< series.length;i++)
            {
                if(input[j] % series[i]==0)
                    count[i] +=1;
            }
        }
        for(int i=0;i< series.length;i++)
        {
            System.out.print(series[i]+" : "+count[i]+ ", " );
        }

    }
}

