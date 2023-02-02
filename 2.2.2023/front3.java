/*
 * Name: front3
 * Description: Given a string, we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, the front is whatever is there. 
 * Return a new string which is 3 copies of the front.
 */

public String front3(String str) {
    if(str.length() < 3){
        return str+str+str;    
    }
    String str1 = "";
    for(int i = 0; i < 3; i++){
        str1+=str.charAt(i);
    }
    return str1+str1+str1;
}