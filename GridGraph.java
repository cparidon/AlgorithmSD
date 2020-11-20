import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class GridGraph {

    private ArrayList<Vertex> gridVertices;

    public GridGraph(){
        gridVertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v){
        gridVertices.add(v);

    }
    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if (!(gridVertices.contains(from) && gridVertices.contains(to))) {
            System.out.println("Vertex not found");
            return;
        }
        Edge newedge = new Edge(from, to, dist);
    }
    public void PrintGraph(){
        Vertex currentV;
        for(int i = 0; i < gridVertices.size() ; i++){

            currentV = gridVertices.get(i);
            System.out.println("From: " + currentV.getName());

            for (int j = 0; j < currentV.getOutEdges().size(); j++){

                Edge currentE = currentV.getOutEdges().get(j);
                System.out.println(" To: " + currentE.getToVertex().getName() + "," + " km to distance: " + currentE.getWeight());
            }
            System.out.println(" ");
        }
    }
    public void MSTPrims(){
        int[] Distance = new int[gridVertices.size()];
        int[] predecessor = new int[gridVertices.size()];
        int[] visited = new int[gridVertices.size()];

        PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();
        Arrays.fill(Distance,Integer.MAX_VALUE);
        Arrays.fill(predecessor, -1);
        Arrays.fill(visited, 0);

        if(gridVertices.size() > 0){
            Distance[0] = 0;
            Q.offer(new Vertex("a"));
        }
        int counter = 0;
        int MST = 0;
        while(!Q.isEmpty() && counter < gridVertices.size()){
            Vertex u = Q.poll();
            for (int v = 0; v < gridVertices.size() ; v++){
            if (Vertex < Distance[v];

            Distance[v] =
        }
    }
   
}

class Vertex implements Comparable<Vertex> {

    Integer distance = Integer.MAX_VALUE;
    private String Name;
    private ArrayList<Edge> OutEdges;


    public Vertex(String id) {
        this.Name = id;
        OutEdges = new ArrayList<Edge>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return OutEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        OutEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void addOutEdge(Edge outEdge){
        OutEdges.add(outEdge);
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance)
            return -1;
        if (this.distance > o.distance)
            return 1;
        return 0;
    }
}

class Edge{

    private Vertex fromVertex;
    private Vertex toVertex;
    public Integer weight;

    public Edge(Vertex from, Vertex to, Integer cost) {
        this.fromVertex = from;
        this.toVertex = to;
        this.weight = cost;
        from.addOutEdge(this);
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
}

