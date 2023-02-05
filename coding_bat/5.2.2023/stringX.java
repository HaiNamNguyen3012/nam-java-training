/*
 * Name: stringX
 * Description:Given a string, return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.
 */

public String stringX(String str) {
    String newString = "";
    for(int i = 0; i < str.length(); i++){
        if(!(i > 0 && i < str.length()-1 && str.substring(i,i+1).equals("x"))){
            newString += str.charAt(i); 
        }
    }
    return newString;
}
