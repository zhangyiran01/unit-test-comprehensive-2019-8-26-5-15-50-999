package tw;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            //input 1234;
            //step 0  1234->列表/数组   "1234".toCharArray();
            //step 1 统计相同的数字；
            //step 2 统计相同数字并且为之相同；
            System.out.println("游戏结束");
        }
    }
}
