/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBinarySearch(mountainArr, target, peak, mountainArr.length() - 1);
    }

    private int peakIndexInMountainArray(MountainArray mountainArr) {
        int s = 0;
        int e = mountainArr.length() - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    private int orderAgnosticBinarySearch(MountainArray mountainArr, int tar, int s, int e) {
        if (s >= e) {
            if (mountainArr.get(s) == tar) return s;
            return -1;
        }

        boolean isAsc = mountainArr.get(s) < mountainArr.get(e);
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midVal = mountainArr.get(mid); 
            
            if (midVal == tar) {
                return mid;
            }
            
            if (isAsc) {
                if (midVal < tar) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (midVal > tar) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}