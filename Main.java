public class Main {

    public static void main(String[] args) {

    GridGraph MyGridGraph = new GridGraph();
    Vertex a = new Vertex("Eskildstrup");
    Vertex b = new Vertex("Haslev");
    Vertex c = new Vertex("Holbæk");
    Vertex d = new Vertex("Jægerspris");
    Vertex e = new Vertex("Kalundborg");
    Vertex f = new Vertex("Korsør");
    Vertex g = new Vertex("Køge");
    Vertex h = new Vertex("Maribo");
    Vertex i = new Vertex("Næstved");
    Vertex j = new Vertex("Ringsted");
    Vertex k = new Vertex("Slagelse");
    Vertex l = new Vertex("Nykøbing F");
    Vertex m = new Vertex("Vordingborg");
    Vertex n = new Vertex("Roskilde");
    Vertex o = new Vertex("Nakskov");
    Vertex p = new Vertex("Sorø");

    MyGridGraph.addVertex(a);
    MyGridGraph.addVertex(b);
    MyGridGraph.addVertex(c);
    MyGridGraph.addVertex(d);
    MyGridGraph.addVertex(e);
    MyGridGraph.addVertex(f);
    MyGridGraph.addVertex(g);
    MyGridGraph.addVertex(h);
    MyGridGraph.addVertex(f);
    MyGridGraph.addVertex(i);
    MyGridGraph.addVertex(j);
    MyGridGraph.addVertex(k);
    MyGridGraph.addVertex(l);
    MyGridGraph.addVertex(m);
    MyGridGraph.addVertex(n);
    MyGridGraph.addVertex(o);
    MyGridGraph.addVertex(p);

    //Eskildstrup
        MyGridGraph.newEdge(a,h,28);
        MyGridGraph.newEdge(a,h, 28);
        MyGridGraph.newEdge(a,l, 13);
        MyGridGraph.newEdge(a,h, 24);

    //Haslev
        MyGridGraph.newEdge(b,f, 60);
        MyGridGraph.newEdge(b,g, 24);
        MyGridGraph.newEdge(b,i, 25);
        MyGridGraph.newEdge(b,j, 19);
        MyGridGraph.newEdge(b,n, 47);
        MyGridGraph.newEdge(b,k, 48);
        MyGridGraph.newEdge(b,p, 34);
        MyGridGraph.newEdge(b,m, 40);

    //Holbæk
        MyGridGraph.newEdge(c,d, 34);
        MyGridGraph.newEdge(c,e, 44);
        MyGridGraph.newEdge(c,f, 66);
        MyGridGraph.newEdge(c,j, 36);
        MyGridGraph.newEdge(c,n, 32);
        MyGridGraph.newEdge(c,k, 46);
        MyGridGraph.newEdge(c,p, 34);

    //Jægerspris
        MyGridGraph.newEdge(d,f, 95);
        MyGridGraph.newEdge(d,g, 58);
        MyGridGraph.newEdge(d,j, 56);
        MyGridGraph.newEdge(d,n, 33);
        MyGridGraph.newEdge(d,k, 74);
        MyGridGraph.newEdge(d,p, 63);

    //Kalundborg
        MyGridGraph.newEdge(e,j, 62);
        MyGridGraph.newEdge(e,n, 70);
        MyGridGraph.newEdge(e,k, 39);
        MyGridGraph.newEdge(e,p, 51);

    //Korsør
        MyGridGraph.newEdge(f,i, 45);
        MyGridGraph.newEdge(f,k, 20);

    //Køge
        MyGridGraph.newEdge(g,i, 45);
        MyGridGraph.newEdge(g,j, 28);
        MyGridGraph.newEdge(g,n, 25);
        MyGridGraph.newEdge(g,m, 60);

    //Maribo
        MyGridGraph.newEdge(h,o, 27);
        MyGridGraph.newEdge(h,l, 26);

    //Næstved
        MyGridGraph.newEdge(i,n, 57);
        MyGridGraph.newEdge(i,j, 26);
        MyGridGraph.newEdge(i,k, 37);
        MyGridGraph.newEdge(i,p, 32);
        MyGridGraph.newEdge(i,m, 28);

    //Ringsted
        MyGridGraph.newEdge(j,n, 31);
        MyGridGraph.newEdge(j,p, 15);
        MyGridGraph.newEdge(j,m, 58);

    //Slagelse
        MyGridGraph.newEdge(k,p, 14);

        MyGridGraph.PrintGraph();
    }
}
