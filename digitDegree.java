/*
Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
*/
int digitDegree(int n) {
    if(n<10 && n>0){return 0;}
    int dig = 1;
    int dD=n;
    for(dig=1;dig>0;dig++){
        char[] cdD=(""+dD).toCharArray();
        int temp=0;
        for(int i=0;i<cdD.length;i++){
            temp+=Character.getNumericValue(cdD[i]);//use correct char to int is important
        }
        dD=temp;
        if(dD<10){break;}
    }
    return dig;

}
