class Solution {
    public int maximumSum(int[] arr) {
        int Nodelete = arr[0];// this will be the value for which no element is deleted;
        int Onedelete = 0;
        // is we take aar[i] and delete the element itself than the array beacame empty;
        int res = arr[0];
        for(int i = 1;i<arr.length;i++){
            int preOneDelete = Onedelete ;// maintain for the onedelete;
            int preNoDelete = Nodelete ; // maintain for the NOdelete;
            int v1 = Nodelete + arr[i];
            int v2 = arr[i];
            Nodelete = Math.max(v1,v2);
            // for the one delete 
            int v3;
            if(preOneDelete == Integer.MIN_VALUE){
                v3 = arr[i];
            }
            else{
                v3 = preOneDelete+arr[i];
            }
           int v4 = preNoDelete;
           Onedelete = Math.max(v3,v4);
           res = Math.max(res,Math.max(Onedelete,Nodelete));
        }
        return res;
    }
}