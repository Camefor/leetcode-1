class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return transfer(firstWord) + transfer(secondWord) == transfer(targetWord);
    }

    private int transfer(String word) {
        int res = 0;
        for (char c : word.toCharArray()) {
            res *= 10;
            res += (c - 'a');
        }
        return res;
    }
}