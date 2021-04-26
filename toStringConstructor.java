public class toStringConstructor {
    String name;
    String branch;
    int roll_no;
    int cgpa;
    toStringConstructor(String name,int roll_no,int cgpa, String branch){
        this.roll_no = roll_no;
        this.name = name;       //This parameter is a reference to the current instance of the class, and is used to access variables that belong to the class.
        this.cgpa = cgpa;
        this.branch = branch;
    }
    public String toString(){
        return "This is the required result : "+ name+" " +roll_no+" "+ branch +" branch passed with  " +cgpa+" CGPA!!";
    }
    public static void main(String args[]){
        toStringConstructor s1 = new toStringConstructor("Nehal",100,8,"CSE");
        toStringConstructor s2 = new toStringConstructor("Granth",200,9,"CE");
        System.out.println(s1);
        System.out.println(s2);

    }

}

