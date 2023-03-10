/*
 * Name: withoutEnd
 * Description: Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
 */
public String withoutEnd(String str) {
    if(str.length() == 2) return "";
    return str.substring(1,str.length()-1);
}
