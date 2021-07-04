/*
Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".
*/
//Regex is complex, save space but cost time, but helpful.
String longestWord(String text) {
    String[] stext = text.split("[^a-zA-Z0-9']+");
    int num=0;
    for(int i=0;i<stext.length;i++){
        num=stext[i].length()>stext[num].length()?i:num;
    }
    return stext[num];

}
