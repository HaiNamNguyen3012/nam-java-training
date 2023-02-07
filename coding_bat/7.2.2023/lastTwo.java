package coding_bat.7.2.2023;

public String lastTwo(String str) {
    if(str.length() < 2)
        return str;
    else if(str.length() == 2){
        return str.substring(1) + str.substring(0,1);
    }
    return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
}
