public class BubbleSort {
    public static void main(String args[]){
        System.out.println("This is Bubble Sort");
        int arr[] = {1,7,25,-1,0,4,8};
        int n = arr.length;

        for(int i = 0;i < n-1;i++){
            boolean sorted = true;

            for (int j =0; j<n-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;

        }
        System.out.println("Sorting array :");
        for(int item: arr){
            System.out.print( item + " ");
        }
    }
}
