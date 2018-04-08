package com.meow.cookie;

public class LeetCode04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l = nums1.length;
		int m = nums2.length;
		int[] result = new int[l + m];
		int j = 0, k = 0;
		for (int i = 0; i < l + m; i++) {
			if (j < l && k < m) {
				if(nums1[j]<nums2[k]) {
					result[i] = nums1[j];
					j++;
				}else {
					result[i] = nums2[k];
					k++;
				}

			} else if (j == l) {
				result[i] = nums2[k];
				k++;
			} else if (k == m) {
				result[i] = nums1[j];
				j++;
			}
		}
		return (l + m) % 2 == 0 ? (double) (result[(l + m) / 2 - 1] + result[(l + m) / 2])/2 : (double) result[(l + m) / 2];
    }
}
