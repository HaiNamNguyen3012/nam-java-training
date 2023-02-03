/*
 * name: mixStart 
 * Description: Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
public boolean mixStart(String str) {
    if(str.length() < 3){
        return false;
    }
    String str1 = str.substring(1,3);
    return (str1.equals("ix"));
}
