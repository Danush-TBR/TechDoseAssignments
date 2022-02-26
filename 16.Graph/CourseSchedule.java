import java.util.*;
class Solution {
    public boolean isCyclic(List<List<Integer>> prerequsite,int curr,int[] visited){
        if(visited[curr]==1) return true;
        visited[curr]=1;
        for(int i:prerequsite.get(curr)){
            if(visited[i]!=2)
                if(isCyclic(prerequsite,i,visited)) return true;
        }
        visited[curr]=2;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int plen = prerequisites.length;
        List<List<Integer>> prerequsite = new ArrayList<>();
        for(int i=0;i<numCourses;i++) prerequsite.add(new ArrayList<>());
        for(int i=0;i<plen;i++) prerequsite.get(prerequisites[i][0]).add(prerequisites[i][1]);
        int[] visited = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(isCyclic(prerequsite,i,visited)) return false;
        }
        return true;
    }
}
