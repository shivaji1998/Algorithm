# Prim's minimal Spanning Tree algorithm

  A tree is a graph of vertices and edges without a cycle.
  
  A spanning tree has all vertices connected and is constructed from the graph, and a graph
  
  can have multiple spanning trees.
  
  A minimal spanning tree is a spanning tree whose sum of weights of edges is the
  minimum.
  
# Prim's minimal Spanning Tree implementation  
 
public void PrimSpanningTree( )

  {
  
    int i, j, k, x, y;
    
  boolean[] Visited = new boolean[nNodes];
  
  int[] MinEdge = new int[nNodes];
  
    Visited[0] = true;
    
   for (k = 1; k < nNodes; k++ )
   
    {
    
   Visited[k] = false;
   
    }
    
    MinEdge[0] = 0;
