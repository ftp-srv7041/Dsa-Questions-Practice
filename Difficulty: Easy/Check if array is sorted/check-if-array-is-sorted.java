class Solution {
    public boolean isSorted(int[] arr) {
        return check(arr, 0);
    }
    public boolean check(int[] arr, int i) {
        if(i == arr.length - 1) {
            return true;
        }
        if(arr[i] > arr[i + 1]) {
            return false;
        }
        return check(arr, i + 1);
    }
}