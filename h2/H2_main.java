public class H2_main {
    public static void main(String[] args) {

        int n = 456789;
        int digits = 0;
        int[] a = new int[9];
        

        int temp = n;
        

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }
        

        temp = n;
        int startIndex = 9 - digits;
        
        for (int i = 8; i >= startIndex && temp > 0; i--) {
            a[i] = temp % 10;
            temp /= 10;
        }
        
        System.out.println("Zahl n: " + n);
        System.out.println("Anzahl der Ziffern (digits): " + digits);
        System.out.println("Array a:");
        for (int i = 0; i < 9; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
