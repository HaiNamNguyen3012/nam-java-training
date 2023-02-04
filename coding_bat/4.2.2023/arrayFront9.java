/*
 * Name: arrayFront9
 * Description: Given an array of ints, return true if one of the first 4 elements in the array is a 9.
 * The array length may be less than 4.
 */

public boolean arrayFront9(int[] nums) {
    int newLength = 4;
    int count = 0;
    if(newLength > nums.length){
        newLength = nums.length;
    }
    for(int i = 0; i < newLength; i++){
        if(nums[i] == 9){
            count++;
        }
    }
    if(count == 0) return false;
    return true;
}
