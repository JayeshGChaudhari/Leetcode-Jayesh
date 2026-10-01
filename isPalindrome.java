public class isPalindrome {
    public static boolean checkIsPalindrome(char[] ch,int left, int right){
        
        if(ch[left]!=ch[right]){
            return false;   
        }
        if(left>=right){
            return true;
        }
        return checkIsPalindrome(ch, left+1, right-1);
    }
    public static void main(String[] args) {
        String s = "abceba";
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        System.out.println(checkIsPalindrome(ch,left,right));
    }
}
