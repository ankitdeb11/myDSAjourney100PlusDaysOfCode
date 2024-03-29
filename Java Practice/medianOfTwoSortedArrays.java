// import java.util.Scanner;

// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
        
//         if (n1 > n2) {
//             return findMedianSortedArrays(nums2, nums1);
//         }
        
//         int left = 0, right = n1;
//         int maxLeft = 0, minRight = 0;
//         while (left <= right) {
//             int partitionX = (left + right) / 2;
//             int partitionY = (n1 + n2 + 1) / 2 - partitionX;
            
//             int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
//             int minRightX = (partitionX == n1) ? Integer.MAX_VALUE : nums1[partitionX];
            
//             int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
//             int minRightY = (partitionY == n2) ? Integer.MAX_VALUE : nums2[partitionY];
            
//             if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
//                 if ((n1 + n2) % 2 == 0) {
//                     maxLeft = Math.max(maxLeftX, maxLeftY);
//                     minRight = Math.min(minRightX, minRightY);
//                     return (maxLeft + minRight) / 2.0;
//                 } else {
//                     maxLeft = Math.max(maxLeftX, maxLeftY);
//                     return maxLeft;
//                 }
//             } else if (maxLeftX > minRightY) {
//                 right = partitionX - 1;
//             } else {
//                 left = partitionX + 1;
//             }
//         }
        
//         throw new IllegalArgumentException();
//     }
// }

// public class medianOfTwoSortedArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int[] nums1 = new int[m];
//         for (int i = 0; i < m; i++) {
//             nums1[i] = sc.nextInt();
//         }
//         int n = sc.nextInt();
//         int[] nums2 = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums2[i] = sc.nextInt();
//         }
        
//         Solution s = new Solution();
//         double median = s.findMedianSortedArrays(nums1, nums2);
//         System.out.println(median);
//     }
// }
