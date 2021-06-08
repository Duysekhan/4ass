import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vertex> vertexList = new ArrayList<>();

        Vertex c1 = new Vertex("A");
        Vertex c2 = new Vertex("B");
        Vertex c3 = new Vertex("C");
        Vertex c4 = new Vertex("D");
        Vertex c5 = new Vertex("E");

        c1.link(c5, 3.4F);
        c1.link(c4, 3.5F);
        c2.link(c1, 1.5F);
        c2.link(c3, 4.0F);
        c3.link(c4, 1.2F);
        c3.link(c5, 3.6F);

        vertexList.add(c1);
        vertexList.add(c2);
        vertexList.add(c3);
        vertexList.add(c4);
        vertexList.add(c5);

        Graph graph = new Graph(vertexList);

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();

        String res = dijkstra.calculate(graph, vertexList.get(2), vertexList.get(4)).toString();

        System.out.println(res);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.breadthFirstSearch(c1);
    }
}
