import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int size = Integer.parseInt(br.readLine());
        
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        mergeSort(arr, 0, size-1);
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<size; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid+1;
        
        int size = right - left + 1;
        int[] tempArr = new int[size];
        int k = 0;
        
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];
                continue;
            }
            tempArr[k++] = arr[j++];
        }
        
        if (i > mid) {
            while (j <= right) {
                tempArr[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                tempArr[k++] = arr[i++];
            }
        }

        for (int l=0; l<size; l++) {
            arr[left + l] = tempArr[l];
        }
    }
}