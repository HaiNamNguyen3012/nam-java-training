/*
 * Name: intMax
 * Description: Given three int values, a b c, return the largest.
 */

public int intMax(int a, int b, int c) {
    if(a <= b && b >= c){
        return b;
    } else if(b <= a && a >= c){
        return a;
    }
    return c;
}
