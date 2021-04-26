public class SmallestInArray {
    public static void main(String args[]) {
            int arr[] = {1,2,3,5,6,7,5,3,6,9};
            int i, min=arr[0];

            for(i = 0;i<10; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println("Smallest number in array is : "+ min);
        }

}

