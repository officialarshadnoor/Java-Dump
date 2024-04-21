public class array {
    public static void main(String[] args) {
        // int a[] = { 1, 4, 5, 67, 8, 78 };

        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }

        // String names[] = { "Arshad", "Noor", "Arairia", "Bihar" };

        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i]);
        // }

        // 2d arrays
        // int nums[][] = new int[3][2];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println(nums.length());

        int nums[][] = {
                { 5, 2, 3, 6 },
                { 8, 3 },
                { 9, 4, 8 }
        };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
