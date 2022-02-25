class Solution {
    public boolean isBipartite(int[][] graph) {
        int len=graph.length;
        int[] colour=new int[len];
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<len;i++){
            if(colour[i]!=0) continue;
            colour[i]=1;
            queue.add(i);
            while(!queue.isEmpty()){
                int curr = queue.poll();
                for(int adj : graph[curr]){
                    if(colour[adj]==0){
                        colour[adj]=-colour[curr];
                        queue.add(adj);
                    }
                    else if(colour[adj]==colour[curr]) return false;
                }
            }
        }
        return true;
    }
}
