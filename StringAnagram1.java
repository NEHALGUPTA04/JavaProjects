public class StringAnagram1 {
    public static void main(String args[]) {
        String a = "bda";
        String b = "abd";
        boolean isAnagram = true;
        int al[] = new int[256];
        int bl[] = new int[256];

        for (char i : a.toCharArray()) {
            int index = (int) i;
            al[index]++;
        }
        for (char i : b.toCharArray()) {
            int index = (int) i;
            bl[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != bl[i]) {
                isAnagram = false;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
