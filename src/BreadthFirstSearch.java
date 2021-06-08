import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<V> {

    public void breadthFirstSearch(Vertex<V> root) {
        Queue<Vertex<V>> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex<V> vertex = queue.remove();
            System.out.println(vertex);

            for (Edge<V> e : vertex.getEdges()) {

                for (Vertex<V> v : e.getVertices()) {
                    if (!v.isVisited()) {
                        v.setVisited(true);
                        queue.add(v);
                    }
                }
            }
        }
    }
}