/*
Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.
*/
char firstDigit(String inputString) {
    char res = '0';
    for(int i=0;i<inputString.length();i++){
        try{
            Integer.parseInt(inputString.substring(i,i+1));
            res = inputString.charAt(i);
            break;
        }
        catch(Exception e){
            continue;
        }
    }
    return res;
    
}
