int singleNumber(int* nums, int numsSize){
    int toReturn=0;
    for(int i=0;i<numsSize;i++) toReturn^=nums[i];
    return toReturn;
}
