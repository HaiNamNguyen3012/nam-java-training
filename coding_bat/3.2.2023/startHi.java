/*
 * name: startHi
 * description: Given a string, return true if the string starts with "hi" and false otherwise.
 */

public boolean startHi(String str) {
    if(str.length() <= 1) return false;
    String newStr = str.substring(0,2);
    if(newStr.equals("hi")){
        return true;
    }
    return false;
}