import java.util.Scanner;
public class Sum_of_array_elements {
}
class Sum{
    public static int sum(int arr[], int n){
        if(n<=0){
            return 0;
        }
        return sum(arr,n-1)+arr[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int []arr = new int[x];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int Sum = sum(arr, arr.length);
        System.out.println(Sum);
    }
