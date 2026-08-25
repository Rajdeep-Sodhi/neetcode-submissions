class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        /*
        calculate the time it will take to reach the target for each position
        make a new array where each element contains (position, time) and sort by position
        start from end of array
            if the position behind has a time equal to or less, decrement index and check again
            else
                increase car fleet
        */
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            list.add(new int[]{position[i], speed[i]});
        }
        list.sort((a, b) -> Integer.compare(b[0], a[0]));

        int output = 0;
        double previousTime = 0;

        for (int i = 0; i < list.size(); i++) {

            int pos = list.get(i)[0];
            int spd = list.get(i)[1];

            double time = (double) (target - pos) / spd;

            if (time > previousTime) {
                output++;
                previousTime = time;
            }
        }

        return output;
    }
}
