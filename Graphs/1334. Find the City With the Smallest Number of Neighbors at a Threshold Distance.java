class Solution {

    void floydwarshal(int n, int dist[][]){
        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if (dist[i][via] != Integer.MAX_VALUE && dist[via][j] != Integer.MAX_VALUE) {
                      dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
                    }
                }
            }
        }
    }

    int findresultcity(int n, int[][]dist, int distanceThreshold){
        int resultcity=-1;
        int leastreachcount=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int countreach=0;
            for(int j=0;j<n;j++){
                if(i!=j && dist[i][j]<=distanceThreshold){
                    countreach++;
                }
            }
            if(countreach<=leastreachcount){
                leastreachcount=countreach;
                resultcity=i;
            }
        }
        return resultcity;
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][]=new int[n][n];

        for(int i=0;i<n;i++){
            dist[i][i]=0;
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            dist[u][v]=w;
            dist[v][u]=w;
        }

        floydwarshal(n,dist);

        return findresultcity(n,dist,distanceThreshold);
    }
}
