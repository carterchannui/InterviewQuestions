public static void findZigZagSequence(int [] a, int n) {
    // Sort array in ascending order.
    Arrays.sort(a);
    // Find midpoint.
    int mid = ((n + 1)/2) - 1;
    // Swap edges of descending subarray.
    int temp = a[mid];
    a[mid] = a[n - 1];
    a[n - 1] = temp;

    int st = mid + 1;
    int ed = n - 2;
    // Swap each element with its mirror.
    while(st <= ed){
        temp = a[st];
        a[st] = a[ed];
        a[ed] = temp;
        st = st + 1;
        ed = ed - 1;
    }
    for(int i = 0; i < n; i++){
        if(i > 0) System.out.print(" ");
        System.out.print(a[i]);
    }
    System.out.println();
}
