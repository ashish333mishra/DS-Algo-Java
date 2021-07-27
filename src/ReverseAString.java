class Solution {
    public void reverseString(char[] s) {
        int end = s.length - 1;
        char temp;
        for(int i = 0; i < s.length/2; i++){
            temp = s[i];
            s[i] = s[end];
            s[end] = temp;
            end--;
        }
    }
}
