// Definition for a Node.
import java.util.*;
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class cloneGraph {
    public void CreateGraph(Node root,Node curr,Node[] visited){
        visited[root.val]=curr;
        for(Node adj : root.neighbors){
            if(visited[adj.val]!=null){
                curr.neighbors.add(visited[adj.val]);
            }
            else{
                Node newNode = new Node(adj.val);
                curr.neighbors.add(newNode);
                CreateGraph(adj,newNode,visited);
            }
        }
    }
    public Node CloneGraph(Node node) {
        if(node==null) return node;
        Node[] visited = new Node[101];
        Node newGraph = new Node(node.val);
        CreateGraph(node,newGraph,visited);
        return newGraph;
    }
}