/*
 * Name: maxEnd3
 * Description: Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
 */
public int[] maxEnd3(int[] nums) {
    int largerNumber = nums[0];
    int result[] = new int[nums.length];
    if(largerNumber < nums[nums.length-1]){
        largerNumber = nums[nums.length-1];
    }
    
    for(int i = 0; i < result.length; i++){
        result[i] = largerNumber;
    }
    return result;
}
