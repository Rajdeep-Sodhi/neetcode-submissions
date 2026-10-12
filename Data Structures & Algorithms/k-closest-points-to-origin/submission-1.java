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

        int[][] res = new int[k][2];
        int j = 0;

        for(int i = 0; i < points.length; i++){
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            minHeap.add(new double[]{i, distance});

            if(i >= points.length-k){
                double[] pointIndex = minHeap.poll();
                res[j][0] = points[ (int) pointIndex[0]][0];
                res[j][1] = points[ (int) pointIndex[0]][1];
                j++;
            }
        }

        return res;
    }
}
