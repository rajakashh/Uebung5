public class H3_main {
    public static void main(String[] args) {

        int[][] einheiten = new int[2][15];
        

        einheiten[0][0] = 50000;   // 500 Euro
        einheiten[0][1] = 20000;   // 200 Euro
        einheiten[0][2] = 10000;   // 100 Euro
        einheiten[0][3] = 5000;    // 50 Euro
        einheiten[0][4] = 2000;    // 20 Euro
        einheiten[0][5] = 1000;    // 10 Euro
        einheiten[0][6] = 500;     // 5 Euro
        einheiten[0][7] = 200;     // 2 Euro
        einheiten[0][8] = 100;     // 1 Euro
        einheiten[0][9] = 50;      // 50 Cent
        einheiten[0][10] = 20;     // 20 Cent
        einheiten[0][11] = 10;     // 10 Cent
        einheiten[0][12] = 5;      // 5 Cent
        einheiten[0][13] = 2;      // 2 Cent
        einheiten[0][14] = 1;      // 1 Cent
        

        for (int i = 0; i < 15; i++) {
            einheiten[1][i] = 0;
        }
        

        int input = 6279;
        

        int remaining = input;
        for (int i = 0; i < 15; i++) {
            if (remaining >= einheiten[0][i]) {
                einheiten[1][i] = remaining / einheiten[0][i];
                remaining = remaining % einheiten[0][i];
            }
        }
        
        System.out.println("Geldbetrag (in Cent): " + input);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(einheiten[i][j] + " ");
            }
            System.out.println();
        }
    }
}

