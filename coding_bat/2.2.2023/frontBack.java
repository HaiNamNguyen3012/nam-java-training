/*
 * Name: frontBack
 * Description: Given a string, return a new string
 * where the first and last chars have been exchanged.
 */

public String frontBack(String str) {
    String newStr = "";
    if(str.length() <= 3){
        for(int i = str.length()-1; i >= 0 ; i--){
            newStr+=str.charAt(i);
        }
    }
    else{
        newStr+=str.charAt(str.length()-1);
        for(int i = 1; i < str.length()-1; i++){
            newStr+=str.charAt(i);
        }
        newStr+=str.charAt(0);
    }
    return newStr;
}
