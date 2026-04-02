class Solution {
    public boolean validTree(int n, int[][] edges) {

        if (edges.length!=n-1){
            return false;
        }

        List<List<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());

        }

        for(int [] e : edges){
            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);

        }
        boolean [] visited= new boolean[n];

        Queue<int[]>queue=new ArrayDeque<>();
        queue.offer(new int[]{0,-1});
        visited[0]=true;

        while(!queue.isEmpty()){
                int [] curr=queue.poll();
                int node=curr[0];
                int parent=curr[1];

                for(int x : adjList.get(node)){
                    if(!visited[x]){
                        queue.offer(new int[]{x,node});
                        visited[x]=true;
                    }

                    else if (x!=parent){
                        return false;
                    }
                }

                
            }

            for(boolean v : visited){
                    if(!v){
                        return false;
                    }

                    // return true;
                }

        return true;



    }

}