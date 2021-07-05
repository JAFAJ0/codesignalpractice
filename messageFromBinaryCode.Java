/*
You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue, you've found a binary code written on the wall behind a vase, and realized that it must be an encrypted message. After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended ASCII code.

Assuming that your hunch is correct, decode the message.

Example

For code = "010010000110010101101100011011000110111100100001", the output should be
messageFromBinaryCode(code) = "Hello!".

The first 8 characters of the code are 01001000, which is 72 in the binary numeral system. 72 stands for H in the ASCII-table, so the first letter is H.
Other letters can be obtained in the same manner.
*/
String messageFromBinaryCode(String code) {
    int len = code.length()/8;
    String co = "";
    for(int i=0;i<len;i++){
        String temp=code.substring(i*8, i*8+8);
        int item= Integer.parseInt(temp,2);
        char ctem = (char)item;
        co+=String.valueOf(ctem);
    }
    return co;
    

}
