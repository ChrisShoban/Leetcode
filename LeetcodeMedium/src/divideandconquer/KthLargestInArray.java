package divideandconquer;

public class KthLargestInArray {
    public int findKthLargest(int[] nums, int k) {
    	// use a quick select approach
    	// randomly choose the pivot, put all items less on left, all items greater on right
    	// pivot represents current kth attempt
    	// if pivot > k, apply quick select to left side
    	// if pivot < k, apply quick select to right side
    	int lower = 0;
    	int upper = nums.length - 1;
		return quickSelect(lower, upper, nums, k, 0);
    }

	private int quickSelect(int lower, int upper, int[] nums, int k, int rightOffset) {
		int pivot = nums[lower];
	    int front = lower + 1;
		for(int i = lower + 1; i <= upper; i++) {
			if(nums[i] <= pivot) {
				swap(nums, i, front++);
			}
		}
		swap(nums, lower, front - 1);
		int pivotKth = nums.length - (front - 1 + rightOffset);
		if(pivotKth == k) {
			return nums[front - 1];
		} else if (pivotKth < k) {
			return quickSelect(lower, front - 2, nums,  k, pivotKth);
		} else { // (pivotKth > k) {
			return quickSelect(lower, front, nums,  k, rightOffset);
		}
	}
	
	private void swap(int[] nums, int i, int front) {
		int tmp = nums[i];
		nums[i] = nums[front];
		nums[front] = tmp;
	}
}
