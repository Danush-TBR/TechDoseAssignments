import java.util.*;

class Solution {
    public boolean isCyclic(List<List<Integer>> graph,Stack<Integer> path,int curr,byte[] visited){
        if(visited[curr]==1) return true;
        visited[curr]=1;
        for(int adj:graph.get(curr)){
            if(visited[adj]!=2 && isCyclic(graph,path,adj,visited)) return true;
        }
        visited[curr]=2;
        path.push(curr);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        Stack<Integer> path = new Stack<Integer>();
        for(int i=0;i<numCourses;i++) graph.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        byte[] visited = new byte[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]==1) return new int[0];
            else if(visited[i]==0){
                if(isCyclic(graph,path,i,visited)){
                    return new int[0];
                }
            }
        }
        int[] way = new int[numCourses]; int i=0;
        while(!path.isEmpty()){
            way[i]=path.pop();
            i++;
        }
        return way;
    }
}