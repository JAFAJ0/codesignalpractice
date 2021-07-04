/*
Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.
*/
int differentSymbolsNaive(String s) {
    Stack<Character> r= new Stack<Character>();
    for(int i=0;i<s.length();i++){
        if (r.contains(s.charAt(i))){
            continue;
        }
        else{r.add(s.charAt(i));}
    }
    return r.size();

}
