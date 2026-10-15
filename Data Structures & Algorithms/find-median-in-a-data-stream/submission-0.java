class MedianFinder {

    List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int index = Collections.binarySearch(list, num);

        if (index < 0) {
            index = -index - 1;
        }

        list.add(index, num);
    }
    
    public double findMedian() {
        int length = list.size();
        int medianIndex = length/2;
        if(length % 2 == 1){
            return (double) list.get(medianIndex);
        }
        return (list.get(medianIndex-1) + list.get(medianIndex))/2.0;
    }
}
