import java.util.*;

public class ArrayOperations {
    public static void main(String args[]){
    
        Scanner s=new Scanner(System.in);    
        int arr[]=new int[100];
        
        System.out.println("Enter n:");
        int n=s.nextInt();
        System.out.println("Enter elements:");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
            if(min>arr[i]) min=arr[i];
            if(max<arr[i]) max=arr[i];
        }
        System.out.println("\nminimum:"+min);
        System.out.println("Maximum:"+max);
        System.out.println("Sum:"+sum);
    }
    
}
