class Fatorial {

    public static int fat (int n) {

        int fat = 1;

        for(int i = 2; i <= n; i++) {
            fat *= i;
        }

        return fat;

    }

}