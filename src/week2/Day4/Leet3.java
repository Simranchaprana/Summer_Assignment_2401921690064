package week2.Day4;

import java.util.ArrayList;
import java.util.List;

public class Leet3 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String curr,
                           int open, int close, int n) {

        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (open < n) {
            backtrack(result, curr + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(result, curr + ")", open, close + 1, n);
        }
    }
}
