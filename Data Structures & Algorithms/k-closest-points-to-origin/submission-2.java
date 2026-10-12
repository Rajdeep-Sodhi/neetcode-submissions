class Solution {
    /*
    keep a min heap
    for every point, calculate the distance formula
        store the index of that point and the distance formula
    for k times
        take the index and take add the points[index]
    */
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> maxHeap =
    new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));

        for(int i = 0; i < points.length; i++){
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            maxHeap.add(new double[]{i, distance});

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            double[] pointIndex = maxHeap.poll();
            res[i][0] = points[ (int) pointIndex[0]][0];
            res[i][1] = points[ (int) pointIndex[0]][1];
        }

        return res;
    }
}
