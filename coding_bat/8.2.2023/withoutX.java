/*
 * Name: withoutX
 * Description: Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 */

public String withoutX(String str) {
    String newString = "";
    for(int i = 0; i < str.length(); i++){
        if(i == 0 && str.charAt(i) == 'x' || i == str.length()-1 && str.charAt(i) == 'x'){
            continue;
        } 
        newString += str.charAt(i);
    }
    return newString;
}
