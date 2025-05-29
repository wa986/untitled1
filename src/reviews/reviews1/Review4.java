package reviews.reviews1;

public class Review4 {
    public static void main(String[] args) {
// int 1number = 5; //①
        int number = 5;
        String str = 88 + "88"; //②
        final double PI = 3.141592; //③
//PI = 3.14; //④再代入禁止
//float circ = 3.14; //⑤doubleからfloatに暗黙型型変換で代入されない
        long a = 10000000000L; //⑥int型のリテラル超えるからlong　long型のリテラルはlが必要
//boolean flg = "true"; //⑦
        boolean flg = true;
        byte b = 35; //⑧
        int num = 0x7F5; //⑨
        //char c = "a"; //⑩
        char c = 'a';
    }
}
