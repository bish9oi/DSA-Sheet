class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if(n<=0){
            return false;
        }
        if(n==1)return false;
        HashSet<Integer> set = new HashSet<>();
        for(int key: nums){
            if(set.contains(key)){
                return true;
            }
            set.add(key);
        }
        return false;
    }
}
