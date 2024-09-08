package PassBy;

public class TestByPassValue {
    public static void main(String[] args) {
        int x=5;
        int y=5;
        int sum =add(x,y);
        System.out.println(sum);
    }

    public static int add(int a, int b){
        a+=b;
        return a;
    }
}
