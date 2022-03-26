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
    
  ### //print the visited nodes
  
    for (k = 1; k < nNodes; k++)
    
    {
    
      x = y = 0;
      
      for (i = 0; i< nNodes; i++ )
      
        for (j = 0; j< nNodes; j++ )
        
         {
         
      if ( Visited[i] && !Visited[j] && Cost[i] [j] < Cost[x][y] )
      
           {
           
             x = i;
             
             y = j;
    
    
