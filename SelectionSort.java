public class SelectionSort {
    public static void main(String args[]){
        System.out.println("Selection Sorting");
        int arr[] = {1,4,90,88,6,-7,0,35};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex = i;

            for(int j = i; j<n;j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted Array is: ");
        for(int item: arr){
            System.out.print(item+ " ");
        }
    }
}
