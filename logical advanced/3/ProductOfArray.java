class ProductOfArray 
{

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        int b[] = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            b[i] = product;
            product *= a[i];
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            b[i] *= product;
            product *= a[i];
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}

