#include <stdio.h>

int main() {
    int arr[] = {64, 25, 12, 22, 11}, n = 5;
    for (int i = 1; i < n; i++) {
        int key = arr[i], j = i - 1;
        while (j >= 0 && arr[j] > key)
            arr[j+1] = arr[j--];
        arr[j+1] = key;
    }
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    return 0;
}
