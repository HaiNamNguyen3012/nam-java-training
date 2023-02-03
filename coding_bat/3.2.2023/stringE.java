/*
 * Name: stringE
 * Description: Return true if the given string contains between 1 and 3 'e' chars.
 */

public boolean stringE(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == 'e'){
            count++;
        }
    }
    if( 1 <= count && count <= 3){
        return true;
    }
    return false;
}
