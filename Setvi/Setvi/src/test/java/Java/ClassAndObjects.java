package Java;

public class ClassAndObjects {

    private String name;
    int rollNo;

    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }

    public void setValue(String str, int num){
        this.name = str;
        this.rollNo = num;
    }

    public static void main(String[] args) {
        ClassAndObjects obj = new ClassAndObjects();
        obj.display();
        obj.name = "Sriram";
        obj.rollNo = 136;
        obj.display();

        ClassAndObjects obj2 = new ClassAndObjects();
        obj2.setValue("Ram", 137);
        obj.display();
    }
}
