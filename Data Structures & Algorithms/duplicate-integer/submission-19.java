class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();


        for(int repeat:nums){
            if(set.contains(repeat)){
                return true;
            }
            set.add(repeat);

        }
        return false;

    }
}