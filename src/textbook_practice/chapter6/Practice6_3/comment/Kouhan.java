package textbook_practice.chapter6.Practice6_3.comment;

import textbook_practice.chapter6.Practice6_1.comment.Zenhan;

//package comment;
public class Kouhan {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws Exception {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        Thread.sleep(3000); // この行を追加
        Zenhan.doTogame();     // もう一度、とがめる
    }
}//分からん
