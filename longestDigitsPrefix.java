/*
Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".
*/
String longestDigitsPrefix(String inputString) {
    String res = "";
    for(int i=1;i<=inputString.length();i++){
        try{
            res=inputString.substring(0,i);
            Integer.parseInt(res);
        }
        catch(Exception e){
            return inputString.substring(0,i-1);
        }
    }
    return res;

}
