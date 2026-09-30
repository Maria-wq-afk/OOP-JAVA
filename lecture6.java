public class lecture6 {
    public static void main(String[] args) {
        int x=3;

        if(x==1){
            System.out.println("Hi");
        }else if(x==2){
            System.out.println("Hello");
        }else if(x==3){
            System.out.println("Good Bye");
        }else{
            System.out.println("Wrong input");
        }


        int age=32;

        if(age<2){
            System.out.println("Infant");
        }else if(age>=2 && age<10){
            System.out.println("Child");
        }else if(age<20){
            System.out.println("Teenage");
        }else if(age<30){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }
    }
}
