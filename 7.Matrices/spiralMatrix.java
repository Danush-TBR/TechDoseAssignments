class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int SR=0,ER=matrix.length-1,SC=0,EC=matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(SR<=ER && SC<=EC){
            for(int i=SC;i<=EC;i++) list.add(matrix[SR][i]);
            for(int i=SR+1;i<=ER;i++) list.add(matrix[i][EC]);
            if(SR<ER) for(int i=EC-1;i>=SC;i--) list.add(matrix[ER][i]);
            if(SC<EC) for(int i=ER-1;i>=SR+1;i--) list.add(matrix[i][SC]);
            SR++; ER--; SC++; EC--;
        }
        return list;
    }
}
