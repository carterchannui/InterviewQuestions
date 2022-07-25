public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                // Agree that the first bad version is within [low, mid].
                high = mid;
            } else {
                // Agree that the first bad version is within [mid + 1, high].
                low = mid + 1;
            }
        }
        return low;
    }
}
