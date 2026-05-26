package Page;

public class LoginPage {

    int a=5;

    public void tutorial(){
        System.out.println(true);

    }
     public void editFile(String FileName){
        System.out.println("Edited file -" + FileName);
     }

    public void editFile(int num){
        System.out.println("Edited file -" + num);
    }


    public void file(){
        int a=10;
        System.out.println(this.a + a);
    }

    public void file2(){
        System.out.println("The value is" + - a);
    }

}
