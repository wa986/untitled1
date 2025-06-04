package textbook_practice.chapter3;

public class Practice3_4 {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else {
            System.out.println("映画を見ます");
            System.out.println("寝ます");
        }
    }
}
// elseのあと{}がない　else文にふくまれていないとして"寝ます"が表示される