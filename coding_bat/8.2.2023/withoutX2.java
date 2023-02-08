/*
 * Name: withoutX2
 * Description: Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
 */

public String withoutX2(String str) {
    String newString = "";
    for(int i = 0; i < str.length(); i++){
        if(i == 0 && str.charAt(i) == 'x' || i == 1 && str.charAt(i) == 'x'){
            continue;
        }
        newString += str.charAt(i);
    }
    return newString;
}
