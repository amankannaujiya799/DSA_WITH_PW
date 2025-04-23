class Arraymissing{
    public static void main(String args[])
    {
        int arr[] =  {1,2,4,5,6,7};
        int n = arr.length;
        int sum_of_natural_number = (n+1)*(n+2)/2;
        int sum = 0;
        for(int i = 0;  i<n; i++)
        {
            sum +=  arr[i];
        }
        int missing_element = 0 ; 
        missing_element  = sum_of_natural_number ;
        System.out.println(missing_element);
    }

        }
