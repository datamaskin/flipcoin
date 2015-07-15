package name.davidwbrown;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FlipCoin {

    /*
    *
    *
    * */
    public static void main(String[] args) {

        final int FLIP = 0;
        final int QUERY = 1;

        Scanner scan = new Scanner(System.in);

        int N = -1;
        int Q = -1;
        int qCmd = -1;
        int A = -1;
        int B = -1;

        if (scan.hasNextInt()) {
            N = scan.nextInt();
        } else {
            System.out.println("No number of coins value");
            return;
        }

        if ((scan.hasNextInt())) {
            Q = scan.nextInt();
        } else {
            System.out.println("No number of command lines value");
        }

        LinkedHashSet<Coin> coins = new LinkedHashSet<Coin>();

        for (int i = 0; i < N; i++) {
            coins.add(new Coin(i));
        }

        Iterator<Coin> iterator = coins.iterator();

        while (iterator.hasNext()) { // test case should be N*TAILS
            Coin coin = iterator.next();
            if (coin.ht.equals(Coin.HeadsTails.TAILS))
                System.out.println(coin.toString());
        }

        scan.nextLine();

        int heads = 0;
        for (int j = 0; j < Q; j++) {
            if (scan.hasNext()) {
                qCmd = scan.nextInt();
            } else {
                System.out.println("No command value");
                return;
            }
            if (scan.hasNext()) {
                A = scan.nextInt();
            } else {
                System.out.println("No start range value");
                return;
            }
            if (scan.hasNext()) {
                B = scan.nextInt();
            } else {
                System.out.println("No end range value");
                return;
            }
            /*iterator = coins.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }*/

            switch (qCmd) {
                case FLIP:
                    flip(coins, A, B);
                    break;
                case QUERY:
                    heads = query(coins, A, B);
                    break;
                default:
                    return;
            }

            if (heads >= 0 && qCmd == QUERY) {
                System.out.println(heads);
            }
        }
    }

    static void flip(LinkedHashSet<Coin> Coins, int A, int B) {
        Iterator<Coin> iterator = Coins.iterator();
        while (iterator.hasNext()) {
            Coin coin = iterator.next();
            int order = coin.order;
            if (order >= A && order <= B) {
                coin.flip();
            }
        }
    }

    static int query(LinkedHashSet<Coin> Coins, int A, int B) {
        Iterator<Coin> iterator = Coins.iterator();
        int heads = 0;
        while (iterator.hasNext()) {
            Coin coin = iterator.next();
            int order = coin.order;
            if (order >= A && order <= B)
                heads += coin.getHeads();
        }
        return heads;
    }

}
