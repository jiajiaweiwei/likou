package likou;

public class Test {
    public static void main(String[] args) {
        long sum = 9;
        long temp = 9;
        int i =1;
        while(i<10){
            temp = temp*10 +9;
            sum = sum+temp;
            i++;
        }
        System.out.print(sum);
    }
}
