package reviews.reviews1;

public class Review8 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        a = (int)b; //a= b;
        a = (int)10000L;
        b = 10000L;
        b = (int)a;
        float f = (float)5.94; //float f = 5.94;
        short s = 10;
    }
}
