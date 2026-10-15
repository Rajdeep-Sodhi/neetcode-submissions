class MedianFinder {

    PriorityQueue<Integer> smallerLeft;
    PriorityQueue<Integer> largerRight;

    public MedianFinder() {
        largerRight = new PriorityQueue<>();
        smallerLeft = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if (smallerLeft.isEmpty() || num <= smallerLeft.peek()) {
            smallerLeft.add(num);
        } else {
            largerRight.add(num);
        }

        if (smallerLeft.size() > largerRight.size() + 1) {
            largerRight.add(smallerLeft.poll());
        } else if (largerRight.size() > smallerLeft.size()) {
            smallerLeft.add(largerRight.poll());
        }
    }
    
    public double findMedian() {
        if(smallerLeft.size() == largerRight.size()){
            return ( (double) smallerLeft.peek() + largerRight.peek())/2;
        }
        return (double) smallerLeft.peek();
    }
}
