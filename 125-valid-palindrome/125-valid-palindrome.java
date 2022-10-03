class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("_","");
        String word = s.toLowerCase().replaceAll("\\W", "");
        
        int a = word.length()-1;
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(a)) {
                counter++;
            }
            a--;
        }
        if (counter == word.length()) {
            return true;
        }
        else {
            return false;
        }
    }
}