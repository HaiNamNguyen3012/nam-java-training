/*
 * Name: startOz
 * Description:Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 */

public String startOz(String str) {
    String newString = "";
    if(str.length() >= 1 && str.charAt(0) == 'o'){
        newString+=str.charAt(0);
    }
    if(str.length() >= 2 && str.charAt(1) == 'z'){
        newString+=str.charAt(1);
    }
    return newString;
}