class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;
        ArrayList<int[]> res = new ArrayList<>();
        
        Arrays.sort(arr , (a,b) -> a[0]-b[0]);
        
        for(int inter[]: arr){
            
            if(res.isEmpty() || res.get(res.size()-1)[1]<inter[0]){
                res.add(inter);
            }else {
                res.get(res.size()-1)[1] = Math.max(
                    res.get(res.size()-1)[1], inter[1]
                );
            }
        }
        return res;
    }
}
