class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0;
        int y=n;
        int[]arr=new int[nums.length];
        int k=0;
        while(y<nums.length){
            arr[k]=nums[x];
            k++;
        arr[k]=nums[y];
          x++;
          y++;
          k++;
    }
    return arr;
    }
}