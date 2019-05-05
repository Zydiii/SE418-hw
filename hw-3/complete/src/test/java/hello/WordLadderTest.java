package hello;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.Stack;

//import static hello.WordLadderController.loadDict;

@RunWith(SpringRunner.class)
@SpringBootTest

public class WordLadderTest {
//    private Set<String> dict = loadDict("static/dictionary.txt");
//
//    private String word1 = "happy";
//    private String word2 = "money";
//
//    @Test
//    public void testWords() {
//        WordLadder wordLadderTest = new WordLadder(word1, word2, dict, 1);
//        String[] ansArray = {"happy", "pappy", "poppy", "moppy", "mopey", "money"};
//        Stack<String> ladder_test = new Stack<>();
//        for (int i = 0; i < ansArray.length; i++) {
//            ladder_test.push(ansArray[i]);
//        }
//        Assert.assertEquals(ladder_test, wordLadderTest.getWords());
//    }
//
//    @Test
//    public void testError() {
//        WordLadder wordLadderTest0 = new WordLadder("happy", "money", dict, 1);
//        Assert.assertEquals("", wordLadderTest0.getError());
//    }
}
