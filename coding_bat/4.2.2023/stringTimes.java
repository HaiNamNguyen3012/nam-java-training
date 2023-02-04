/*
 * Name: stringTimes
 * Description: Given a string and a non-negative int n,
 * return a larger string that is n copies of the original string.
 */

public String stringTimes(String str, int n) {
    String newStr = "";
    for(int i = 0; i < n; i++){
        newStr += str;
    }
    return newStr;
}
