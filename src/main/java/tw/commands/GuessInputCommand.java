package tw.commands;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jxzhong on 2017/5/19.
 */
public class GuessInputCommand {

    private BufferedReader bufferedReader;

    public GuessInputCommand() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() throws IOException {
        System.out.println("------Please input your answer as x x x x , x <10 ------");
        return bufferedReader.readLine();
    }
    
    public String guessGame(String input,String answer) {
    	//字符串转化为列表
    	int A=0,B=0;
    	List<String> inputList =Arrays.asList(input.split(""));
    	List<String> answerList =Arrays.asList(input.split(""));
    	//统计相同数字
    	
    	
    	
    }
}
