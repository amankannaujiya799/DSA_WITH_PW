#include <stdio.h>

int main() {
    int arr[] = {10, 20, 30, 40, 50}, n = 5, key = 30, found = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) {
            printf("Element found at index %d\n", i);
            found = 1;
            break;
        }
    }
    if (!found)
        printf("Element not found\n");
    return 0;
}
