// class Solution {
//     public int longestOnes(int[] nums, int k) {
//        int low=0;
//        int zerocount=0;
//        int maxlen=0;
//        for(int high=0;high<nums.length;high++){
//         if(nums[high]==0){
//         zerocount++;
//         }
//         while(zerocount>k){
//             if(nums[low]==0){
//                 zerocount--;
//             }
//             low++;
//         }
//         maxlen=Math.max(maxlen,high-low+1);
//        } 
//        return maxlen;
//     }
// }

//  solved using integer mapping 

class Solution {
    public int longestOnes(int[] nums, int k) {
       int low=0;
       int ans=0;
       int maxfreq=0;
       int[] freq=new int[256];
       for(int high=0;high<nums.length;high++){
        freq[nums[high]]++;
        maxfreq=Math.max(maxfreq,freq[1]);
        while((high-low+1)-maxfreq>k){
            freq[nums[low]]--;
            low++;
        }
        ans=Math.max(ans,high-low+1);
       }
       return ans;
    }
}


