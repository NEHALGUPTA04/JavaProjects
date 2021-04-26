public class toString {
    public static void main(String args[]){
        int a = 220;
        String str = Integer.toString(a);
        System.out.println(str);

        Float i = 30303.45f;
        String j = Double.toString(i);
        System.out.println(j);


        double c = 30303.4545;
        String d = Double.toString(c);

        System.out.println(d);
        System.out.println(a+""+" and " +d);
        System.out.println(str+" " + d);   //toprove that it got converted to string
    }
}
