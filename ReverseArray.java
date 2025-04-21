public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,3,0,5,4,0,2,};
        int n = arr.length;
        for(int i =0 ; i<n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Here is reverse array");
        for(int i = 0; i<n; i++)
        {
          System.out.println(arr[i]);
        }
        }
    
}
