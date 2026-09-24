package LeetCode;

public class 496_NextGreaterElementI {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
Arrays.fill(arr, -1);

for(int i = 0; i < nums1.length; i++) {
    int a = nums1[i];

    for(int j = 0; j < nums2.length; j++) {

        if(nums2[j] == a) {

            for(int k = j + 1; k < nums2.length; k++) {

                if(nums2[k] > a) {
                    arr[i] = nums2[k];
                    break;
                }
            }
            break;
        }
    }
}

return arr;
    }
}

