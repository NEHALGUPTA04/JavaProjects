public class IsPresentInArray {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 5, 6, 7, 5, 3, 10,9};
        int Key_To_Find = 11;

        int i;

        for (i = 0; i < 10; i++) {
            if (arr[i] == Key_To_Find) {
                System.out.println("Yes the key is present in array!! at index :" + "" + i);

            }

        }
        System.out.println("Ohoo , the key is not present in array!!");
    }
}

