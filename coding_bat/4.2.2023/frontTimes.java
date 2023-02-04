/*
 * Name: frontTimes 
 * Description: Given a string and a non-negative int n,
 * we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3.
 * Return n copies of the front
 */

public String frontTimes(String str, int n) {
    int frontLenStr = 3;
    String newStr = "";
    if(frontLenStr > str.length()){
        frontLenStr = str.length();
    }
    String frontStr = str.substring(0, frontLenStr);
    for(int i = 0; i < n; i++){
        newStr += frontStr;
    }
    return newStr;
}
