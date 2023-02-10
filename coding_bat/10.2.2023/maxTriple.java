/*
 * Name: maxTriple
 * Description: Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
 */
public int maxTriple(int[] nums) {
    int middleElement = (nums.length-1)/2;
    int newArr[] = new int[3];
    newArr[0] = nums[0];
    newArr[1] = nums[middleElement];
    newArr[2] = nums[nums.length-1];
    int max = 0;
    for(int i = 0; i < 3; i++){
        if(max < newArr[i]) 
        max = newArr[i];
    }
    return max;
}  
