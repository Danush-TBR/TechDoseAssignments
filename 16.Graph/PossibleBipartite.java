import java.util.*;
class possibleBipartite {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n+1;i++) graph.add(new ArrayList<>());
        int[] color = new int[n+1]; int curr;
        for(int i=0;i<dislikes.length;i++){
            graph.get(dislikes[i][0]).add(dislikes[i][1]);
            graph.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<n+1;i++){
            if(color[i]!=0) continue;
            color[i]=1;
            queue.add(i);
            while(!queue.isEmpty()){
                curr=queue.poll();
                for(int adj:graph.get(curr)){
                    if(color[adj]==0){
                        color[adj]=-color[curr];
                        queue.add(adj);
                    }
                    else if(color[adj]==color[curr]) return false;
                }
            }
        }
        return true;
    }
}