class SecondLarestArray{
    static int secSmallest(int arr[] , int n)
    {
        int smallest = arr[0];
        for(int i 0 ; i<n; i++)
        {
            if(arr[i] < smallest)
            smallest = arr[i];
        }
        int secsmallest = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
        if(arr[i] ! =  smallest && arr[i] < secsmallest)
        secsmallest = arr[i];
    }
    return secsmallest;

}
public static void main(String[] args) {
    int arr[] = {12, 13, 1, 10, 34, 10};
      int n = arr.length;
      System.out.print(secSmallest(arr, n)); 
   }
    
}