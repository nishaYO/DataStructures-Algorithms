package mypackage;

public class Counter {
    public static void main(String[] args) {
        int num = 23893;
        int count = 0;
        while(num>0){
            if(num%10 == 3){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
