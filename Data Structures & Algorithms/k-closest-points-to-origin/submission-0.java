class Solution {
    /*
    keep a min heap
    for every point, calculate the distance formula
        store the index of that point and the distance formula
    for k times
        take the index and take add the points[index]
    */
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> minHeap =
    new PriorityQueue<>((a, b) -> Double.compare(a[1], b[1]));

        for(int i = 0; i < points.length; i++){
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            minHeap.add(new double[]{i, distance});
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            double[] pointIndex = minHeap.poll();
            res[i][0] = points[ (int) pointIndex[0]][0];
            res[i][1] = points[ (int) pointIndex[0]][1];
        }

        return res;
    }
}
