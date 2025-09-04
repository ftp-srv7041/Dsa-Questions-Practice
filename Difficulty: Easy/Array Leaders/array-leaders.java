class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> arrleader = new ArrayList<>();
        int n = arr.length;
        
        int max = arr[n - 1];      
        arrleader.add(max);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {    
                max = arr[i];
                arrleader.add(max);
            }
        }
        
        Collections.reverse(arrleader);
        return arrleader;
    }
}
