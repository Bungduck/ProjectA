package Dict;

public class Student{
    private int s1;
    private String name;

    public Student(int s1, String name){
        this.s1 = s1;
        setName(name);
    }

    public void display(){
        System.out.println(s1 + " " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public int getS1(){
        return s1;
    }





}
