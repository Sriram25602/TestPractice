package Page;


// we can assign variables as private to hiding unncessasory data. So we have to create method and call it to access the private variable




public class Encapsulation {

    private int number;

    public void getNumber(){// we can't call the private variable. So create one public method and add variable on it.

        this.number = 10;
        System.out.println(number);
    }

    public void setNumber(int number){  // This is setter method - to set a value for private variable
        this.number = number;
        System.out.println(number);

    }

}

class callM{
    public static void main(String[] args){
        Encapsulation obj = new Encapsulation();
        obj.getNumber();
        obj.setNumber(50);


    }

}
