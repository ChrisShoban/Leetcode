package array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int back = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == val) {
                swap(nums, i, back--);
            }
        }
        return back + 1;
    }
    
    private void swap(int[] nums, int i, int total) {
        int tmp = nums[i];
        nums[i] = nums[total];
        nums[total] = tmp;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        RemoveElement test = new RemoveElement();
        System.out.println(test.removeElement(new int[]{2}, 3));
        System.out.println(test.removeElement(new int[]{3,3}, 3));
        System.out.println(test.removeElement(new int[]{4,5}, 4));

    }

}