import java.util.HashSet;
import java.util.Set;

public class Graph {

    Set<Node1> nodes = new HashSet<>();

    public static Node1 getGraph(){
        Graph result = new Graph();

        Node1 a = new Node1("A", new HashSet<>());
        Node1 b = new Node1("B", new HashSet<>());
        Node1 c = new Node1("C", new HashSet<>());
        Node1 d = new Node1("D", new HashSet<>());
        Node1 e = new Node1("E", new HashSet<>());
        Node1 f = new Node1("F", new HashSet<>());
        Node1 g = new Node1("G", new HashSet<>());
        Node1 h = new Node1("H", new HashSet<>());

        a.addNeighbor(b); a.addNeighbor(c); a.addNeighbor(d); a.addNeighbor(e);
        b.addNeighbor(c);b.addNeighbor(g);
        c.addNeighbor(a);c.addNeighbor(d);
        d.addNeighbor(a);d.addNeighbor(c); d.addNeighbor(h);
        e.addNeighbor(a);e.addNeighbor(d);e.addNeighbor(f);
        f.addNeighbor(e);f.addNeighbor(g);f.addNeighbor(h);
        h.addNeighbor(f);h.addNeighbor(d);
        g.addNeighbor(b);g.addNeighbor(f);

        result.nodes.add(a);
        result.nodes.add(b);
        result.nodes.add(c);
        result.nodes.add(d);
        result.nodes.add(e);
        result.nodes.add(f);
        result.nodes.add(g);
        result.nodes.add(h);

        return a;
    }
}
