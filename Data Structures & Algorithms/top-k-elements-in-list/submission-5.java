class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list  = new ArrayList<>(count.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            res[i]=(list.get(i).getKey());
        }
        return res;

        
    }
}
