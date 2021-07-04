/*
Check if the given string is a correct time representation of the 24-hour clock.

Example

For time = "13:58", the output should be
validTime(time) = true;
For time = "25:51", the output should be
validTime(time) = false;
For time = "02:76", the output should be
validTime(time) = false.
*/
boolean validTime(String time) {
    if(time.charAt(0)==':'||time.charAt(time.length()-1)==':'){return false;}
    String[] t=time.split(":");
    if(t.length!=2){return false;}
    try{
        int h=Integer.parseInt(t[0]);
        if(h<0||h>23){return false;}
        int m=Integer.parseInt(t[1]);
        if(m<0||m>59){return false;}
    }
    catch(Exception e){return false;}
    return true;
}
