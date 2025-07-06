class Linearsearch
{

  	static int search(int a[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    // this is more concept in this project for working
    {
        int[] a = { 3, 4, 1, 7, 5 };
        int n = a.length;
        
        int x = 10;

        int index = search(a, n, x);
        
      	if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at index: " + index);
    }
}