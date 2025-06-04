package textbook_practice.chapter2;

import java.io.*;
public class Practice2_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください＞");
        String ageInput = br.readLine();
        int age = Integer.parseInt(ageInput);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("(1: 大吉　2: 中吉　3: 吉　4: 凶)");
    }
}
/*public class Practice2_3 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.print("あなたの年齢を入力してください＞");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("(1: 大吉　2:中吉　3:吉　4: 凶)");
    }
}*/
