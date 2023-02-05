/*
 * Name: doubleX
 * Description: Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 */

boolean doubleX(String str) {
    int positionX = str.indexOf("x");
    
    if(positionX + 1 >= str.length()) return false;
    
    return(str.charAt(positionX+1) == 'x');
}
