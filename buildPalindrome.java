/*Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".
*/
String buildPalindrome(String st) {
    if(isPalindrome(st)){return st;}
    String temp=st;
    for(int i=0;i<st.length();i++){
        String te = st.substring(0,i+1);
        StringBuilder input1 = new StringBuilder(te);
        input1.reverse();
        temp=st+input1.toString();
        if(isPalindrome(temp)){break;}
    }
    return temp;

}
boolean isPalindrome(String st){
    int i=0;int j=st.length()-1-i;
    while(i<=st.length()/2){
        if(st.charAt(i)!=st.charAt(j)){
            return false;
        }
        i++;j=st.length()-1-i;
    }
    return true;
}
