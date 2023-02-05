/*
 * Name: stringSplosion
 * Description: Given a non-empty string like "Code" return a string like "CCoCodCode".
 */

public String stringSplosion(String str) {
    String newStr = "";
    for(int i = 0; i < str.length(); i++){
        String childStr = str.substring(0, i+1);
        newStr += childStr;
    }
    return newStr;
}
