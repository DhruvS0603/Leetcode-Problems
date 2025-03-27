class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int currentNum=1;
        int index=0;
        while (count < k) {
            if (index < arr.length && currentNum == arr[index]) {
                currentNum++;
                index++;
            } else {
                count++;
                if (count == k) {
                    return currentNum;
                }
                currentNum++;
            }
        }
        return -1;
    }
}