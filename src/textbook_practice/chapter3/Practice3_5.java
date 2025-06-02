package textbook_practice.chapter3;

import java.io.*;
public class Practice3_5 {
    public static void main(String[] args) throws IOException {
        System.out.print("［メニュー］1：検索 2：登録 3：削除 4：変更＞");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int selected = Integer.parseInt(line);
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }
    }
}

