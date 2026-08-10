class Solution {
    public int removeDuplicates(int[] nums) {
         if(nums.length ==0){
            return 0;
         }
         int writeindex =0;
         int readindex;
         for(readindex=1;readindex<= nums.length-1;readindex++){
            if(nums[readindex]!= nums[writeindex]){
                writeindex++;
                nums[writeindex] =nums[readindex];
            }
         }
         return writeindex +1;
        
    }
}