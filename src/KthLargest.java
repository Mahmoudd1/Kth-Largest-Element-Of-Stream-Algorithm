import java.util.PriorityQueue;
class KthLargest {
    PriorityQueue<Integer> heap;
    int a=0;
    public KthLargest(int k, int[] nums) {
        a=k;
        heap=new PriorityQueue<>();
        for (int num:nums)
        {
            heap.add(num);
        }
        while (heap.size()>k)
        {
            heap.poll();
        }
    }

    public int add(int val) {
        if (heap.size()<a)
        {
            heap.add(val);
            return heap.peek();
        }
        if (val<heap.peek())
        {
            return heap.peek();
        }
        else
        {
            heap.add(val);
            heap.poll();
            return heap.peek();

        }

    }
}