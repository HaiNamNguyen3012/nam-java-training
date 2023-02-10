/*
 * Name: midThree
 * Description:Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */
public int[] midThree(int[] nums) {
    int middleLength = (nums.length-1)/2;
    return new int[] {nums[middleLength-1],nums[middleLength],nums[middleLength+1]};
}  
