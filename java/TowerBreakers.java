public static int towerBreakers(int n, int m) {
    // Check if tower height is equal to 1.
    if (m == 1) {
        return 2;
    } else {
        // If the number of towers is odd, return 1.
        // If the number of towers is even, return 2.
        return (n % 2 == 0) ? 2 : 1;
    }
}
