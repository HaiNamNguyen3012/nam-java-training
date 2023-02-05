/*
 * Name: array123
 * Description: Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 */

public boolean array123(int[] nums) {
    int count = 0;
    for(int i = 1; i < nums.length - 1; i++){
        if(nums[i-1] == 1 && nums[i] == 2 && nums[i+1] == 3){
            count++;
        }
    }
    if(count==0) return false;
    return true;
}
