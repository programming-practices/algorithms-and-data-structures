package data_structures.graphs.a2;

import java.util.Scanner;

/*Implementation of Bellman ford to detect negative cycles. Graph accepts inputs in form of edges which have
start vertex, end vertes and weights. Vertices should be labelled with a number between 0 and total number of vertices-1,both inclusive*/
class BellmanFord {
    int vertex, edge;
    private Edge edges[];
    private int index = 0;

    public BellmanFord(int v, int e) {
        vertex = v;
        edge = e;
        edges = new Edge[e];
    }

    class Edge {
        int u, v;
        int w;

        /**
         * @param a Source Vertex
         * @param b End vertex
         * @param c Weight
         */
        public Edge(int a, int b, int c) {
            u = a;
            v = b;
            w = c;
        }
    }

    /**
     * @param p Parent array which shows updates in edges
     * @param i Current vertex under consideration
     */
    public void printPath(int[] p, int i) {
        if (p[i] == -1)//Found the path back to parent
            return;
        printPath(p, p[i]);
        System.out.print(i + " ");
    }

    public static void main(String args[]) {
        BellmanFord obj = new BellmanFord(0, 0);//Dummy object to call nonstatic variables
        obj.go();
    }

    //Interactive run for understanding the class first time. Assumes source vertex is 0 and shows distaance to all vertices
    public void go() {
        Scanner sc = new Scanner(System.in);//Grab scanner object for user input
        int i, v, e, u, ve, w, j, neg = 0;
        System.out.println("Enter no. of vertices and edges please");
        v = sc.nextInt();
        e = sc.nextInt();
        Edge arr[] = new Edge[e];//Array of edges
        System.out.println("Input edges");
        for (i = 0; i < e; i++) {
            u = sc.nextInt();
            ve = sc.nextInt();
            w = sc.nextInt();
            arr[i] = new Edge(u, ve, w);
        }
        int dist[] = new int[v];//Distance array for holding the finalized shortest path distance between source and all vertices
        int p[] = new int[v];//Parent array for holding the paths
        for (i = 0; i < v; i++)
            dist[i] = Integer.MAX_VALUE;//Initializing distance values
        dist[0] = 0;
        p[0] = -1;
        for (i = 0; i < v - 1; i++) {
            for (j = 0; j < e; j++) {
                if ((int) dist[arr[j].u] != Integer.MAX_VALUE && dist[arr[j].v] > dist[arr[j].u] + arr[j].w) {
                    dist[arr[j].v] = dist[arr[j].u] + arr[j].w;//Update
                    p[arr[j].v] = arr[j].u;
                }
            }
        }
        //Final cycle for negative checking
        for (j = 0; j < e; j++)
            if ((int) dist[arr[j].u] != Integer.MAX_VALUE && dist[arr[j].v] > dist[arr[j].u] + arr[j].w) {
                neg = 1;
                System.out.println("Negative cycle");
                break;
            }
        //Go ahead and show results of computaion
        if (neg == 0) {
            System.out.println("Distances are: ");
            for (i = 0; i < v; i++)
                System.out.println(i + " " + dist[i]);
            System.out.println("Path followed:");
            for (i = 0; i < v; i++) {
                System.out.print("0 ");
                printPath(p, i);
                System.out.println();
            }
        }
    }

    /**
     * @param source Starting vertex
     * @param end    Ending vertex
     * @param arr   Array of edges
     */
    //Just shows results of computation, if graph is passed to it. The graph should
    //be created by using addEdge() method and passed by calling getEdgeArray() method
    public void show(int source, int end, Edge arr[]) {
        int i, j, v = vertex, e = edge, neg = 0;
        double dist[] = new double[v];//Distance array for holding the finalized shortest path distance between source and all vertices
        int p[] = new int[v];//Parent array for holding the paths
        for (i = 0; i < v; i++)
            dist[i] = Integer.MAX_VALUE;//Initializing distance values
        dist[source] = 0;
        p[source] = -1;
        for (i = 0; i < v - 1; i++) {
            for (j = 0; j < e; j++) {
                if ((int) dist[arr[j].u] != Integer.MAX_VALUE && dist[arr[j].v] > dist[arr[j].u] + arr[j].w) {
                    dist[arr[j].v] = dist[arr[j].u] + arr[j].w;//Update
                    p[arr[j].v] = arr[j].u;
                }
            }
        }
        //Final cycle for negative checking
        for (j = 0; j < e; j++)
            if ((int) dist[arr[j].u] != Integer.MAX_VALUE && dist[arr[j].v] > dist[arr[j].u] + arr[j].w) {
                neg = 1;
                System.out.println("Negative cycle");
                break;
            }
        //Go ahead and show results of computaion
        if (neg == 0) {
            System.out.println("Distance is: " + dist[end]);
            System.out.println("Path followed:");
            System.out.print(source + " ");
            printPath(p, end);
            System.out.println();
        }
    }

    /**
     * @param x Source Vertex
     * @param y End vertex
     * @param z Weight
     */
    //Adds unidirectionl Edge
    public void addEdge(int x, int y, int z) {
        edges[index++] = new Edge(x, y, z);
    }

    public Edge[] getEdgeArray() {
        return edges;
    }
}