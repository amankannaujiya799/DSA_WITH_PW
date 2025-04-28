#include <stdio.h>

int main() {
    int arr[] = {10, 20, 30, 40, 50}, n = 5, key = 30;
    int low = 0, high = n-1, mid, found = 0;
    
    while (low <= high) {
        mid = (low + high) / 2;
        if (arr[mid] == key) {
            printf("Element found at index %d\n", mid);
            found = 1;
            break;
        } else if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    
    if (!found)
        printf("Element not found\n");
        
    return 0;
}
