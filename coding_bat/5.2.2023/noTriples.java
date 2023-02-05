/*
 * Name: noTriples
 * Description: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 */

public boolean noTriples(int[] nums) {
    int count = 0;
    for(int i = 1; i < nums.length - 1; i++){
        if(nums[i] == nums[i-1] && nums[i] == nums[i+1]){
            count++;
        }
    }
    if(count == 0){
        return true;
    }
    return false;
}
