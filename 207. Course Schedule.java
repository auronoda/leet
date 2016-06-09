public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] in = new int[numCourses];
        ArrayList<Integer>[] out = new ArrayList[numCourses];
        Queue<Integer> queue = new LinkedList<Integer>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            out[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < prerequisites.length; i++){
            in[prerequisites[i][0]]++;
            out[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; i++){
            if (in[i] == 0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int u = queue.poll();
            for (int i: out[u]){
                in[i]--;
                if (in[i] == 0){
                    queue.add(i);
                }
            }
            count++;
        }
        if (count == numCourses){
            return true;
        }
        return false;
    }
}