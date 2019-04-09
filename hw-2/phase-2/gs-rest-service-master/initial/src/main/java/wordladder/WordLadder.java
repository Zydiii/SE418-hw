package wordladder;

import java.util.*;

public class WordLadder {
    private long id;
    private String word1, word2;
    private Stack<String> words;
    private String error = "";

    public  void setId(long id){
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public String getWord1() {
        return word1;
    }
    public void setWord1(String word1) {
        this.word1 = word1;
    }
    public String getWord2() {
        return word2;
    }
    public void setWord2(String word2) {
        this.word2 = word2;
    }
    public Stack<String> getWords() {
        return words;
    }
    public void setWords(Stack<String> words) {
        this.words = words;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }

    WordLadder() {}
    WordLadder(String word1, String word2, Set<String> wordSet, long id) {
        this.id = id;
        this.word1 = word1;
        this.word2 = word2;

        if (wordcheck(this.word1, this.word2, wordSet) == 1) {
            return;
        }

        this.words = ladder(this.word1, this.word2, wordSet);
    }

    private int wordcheck(String word1, String word2, Set<String> wordSet) {

        if (word1.equals(word2)) {
            this.error = "Word1 and word2 are the same, please enter two different words.";
            return 1;
        }

        if (word1.length() != word2.length()) {
            this.error = "Word1 and word2 should be of the same length, please enter two words of the same size.";
            return 1;
        }

        if (!wordSet.contains(word1)) {
            this.error = "Sorry, word1 doesn't exist in the dictionary.";
            return 1;
        }

        if (!wordSet.contains(word2)) {
            this.error = "Sorry, word2 doesn't exist in the dictionary.";
            return 1;
        }

        return 0;
    }

    public Stack<String> ladder(String word1, String word2, Set<String> wordSet) {
        Queue<Stack<String>> ladder = new LinkedList<Stack<String>>();
        Stack<String> first = new Stack<String>();
        first.push(word1);
        ladder.offer(first);
        Set<String> pre_words = new HashSet<String>();
        pre_words.add(word1);
        Stack<String> words = new Stack<String>();
        int len = word1.length();
        while (true) {
            Stack<String> _last = ladder.poll();
            String pre = _last.peek();
            for (int i = 0; i < len; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    String change_word = pre;
                    String new_word = change_word.substring(0, i) + j + change_word.substring(i + 1, word1.length());
                    change_word = new_word;
                    if (wordSet.contains(change_word) && !pre_words.contains(change_word)) {
                        @SuppressWarnings("unchecked")
                        Stack<String> _new = (Stack<String>) _last.clone();
                        _new.push(change_word);
                        ladder.offer(_new);
                        pre_words.add(change_word);
                    }
                    if (change_word.equals(word2)) {
                        while (ladder.size() > 1) {
                            ladder.poll();
                        }
                        words = ladder.peek();
                        return words;
                    }
                }
            }
            if (ladder.size() == 0)
                return words;
        }
    }

}