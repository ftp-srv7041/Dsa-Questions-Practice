class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int finalmax=Integer.MIN_VALUE;
        int finalmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<finalmin){
                finalmin=arr[i];
            }
            if(arr[i]>finalmax){
                finalmax=arr[i];
            }
        }
       ArrayList<Integer> result=new ArrayList<>();
       result.add(finalmin);
       result.add(finalmax);
       return result;
    }
}
