import java.util.*;

class findAllPath {
    public void findPath(int[][] graph,int source,int target,List<List<Integer>> paths,List<Integer> path){
        if(source==target){
            paths.add(new ArrayList<>(path));
        }
        else{
            for(int adj:graph[source]){
                path.add(adj);
                findPath(graph,adj,target,paths,path);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if(graph.length==0) return null;
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        findPath(graph,0,graph.length-1,paths,path);
        return paths;
    }
}