import java.util.Objects;
import java.util.Set;

public class Node1 {

    String name;

    public String getName() {
        return name;
    }

    public Set<Node1> getNeighbors() {
        return neighbors;
    }

    private Set<Node1> neighbors;

    public Node1(String name, Set<Node1> neighbors) {
        this.name = name;
        this.neighbors = neighbors;
    }

    public void addNeighbor(Node1 node){
        this.neighbors.add(node);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node1 node = (Node1) o;
        return Objects.equals(name, node.name) && Objects.equals(neighbors, node.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
