public class lecture9 {
    public static void main(String[] args) {
        for(int i=100; i>=0 ; i=i-10){
        System.out.println(i);
    }
    int sum=0;
    for(int x=30; x<=120; x++){
        if(x%3==0 && x% 5==0){
            sum= sum +x;
        }
    }
    System.out.println("Sum is:" +sum);
    }
}
