package com.example.proyecto03pathfinder;


public class Dijkstra_Algorithm {

    public static String texto = "";

    public static void dijkstra(int[][] graph, int sourceVertex, int arrival) {
        /*if (arrival == 0){
          //  arrival = sourceVertex;
           // sourceVertex = 0;
        }*/
        try {
            if (sourceVertex >= 0 && sourceVertex <= 17 && arrival >= 0 && arrival <= 17) {
                int vertexCount = graph.length;
                boolean[] visitedVertex = new boolean[vertexCount];
                int[] distance = new int[vertexCount];


                for (int i = 0; i < vertexCount; i++) {
                    visitedVertex[i] = false;
                    distance[i] = Integer.MAX_VALUE;
                }
                distance[sourceVertex] = 0; // distance of source vertex to itself is zero
                for (int i = 0; i < vertexCount; i++) {
                    //find the neighbouring unvisited vertex having  minimum distance from source vertex
                    //for the first time u will be the source vertex and the distance array will be updated with the neighbouring vertex distance of source vertex

                    int u = findMinDistance(distance, visitedVertex);
                    //u is the row and v is the column

                    visitedVertex[u] = true;
                    //now update all the neighbour vertex distances


                    for (int v = 0; v < vertexCount; v++) {
                        //graph[u][v] != 0 -> there should be a direct edge
                        if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                            distance[v] = distance[u] + graph[u][v];
                        }
                    }
                }


                int i = arrival;
                //System.out.println(String.format("Distance from source vertex %s to vertex %s is %s", sourceVertex, i, distance[i]));
                texto = String.format("El tiempo aproximado en desplazarse del vertice %s al vertice %s es %s minutos", sourceVertex, i, distance[i]);
            }

        } catch (Exception e) {
            System.out.println("La ruta ingresada no es valida");
        }
    }

    public String mostrartexto() {
        return texto;
    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = 1;
        for (int i = 0; i < distance.length; i++) {
            //the vertex should not be visited and the distance should be the minimum.
            //this is similar to finding the min element of an array
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

    //El error solamente surge cuando va de X a 0
    //TODO hacerlo invertido, en vez de X a 0, de 0 a X
    public static void main(String[] args) {
        int graph[][] = new int[][]{
                {0, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {73, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 27, 0, 4, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 2, 0, 0, 0, 5, 0, 0, 0, 0, 0, 4, 0, 0},
                {0, 0, 3, 0, 2, 0, 6, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 6, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 10, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 7, 0, 0, 4, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 18, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 9, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 9, 0, 0},
                {0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 9, 6},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 8},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 8, 0}};
        Dijkstra_Algorithm t = new Dijkstra_Algorithm();
        int source = 17;
        int arrival = 5;
        t.dijkstra(graph, source, arrival);
    }
}
