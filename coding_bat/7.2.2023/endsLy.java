/*
 * Name: endsLy
 * Description: Given a string, return true if it ends in "ly".
 */
public boolean endsLy(String str) {
    if(str.length() < 2) return false;
    String endString = str.substring(str.length() - 2);
    if(endString.equals("ly")) return true;
    return false;
}
