package name.davidwbrown;

/**
 * Created by david on 7/14/15.
 */
public class Coin {


    public enum HeadsTails {
        TAILS, HEADS;
    }

    HeadsTails ht;

    int order = -1;

    public Coin(HeadsTails ht) {
        this.ht = ht;
    }

    public Coin(int order) {
        this.order = order;
        this.ht = HeadsTails.TAILS;
    }

    public Coin() {
        this.ht = HeadsTails.TAILS;
    }

    void flip() {
        switch (ht) {
            case TAILS:
                ht = HeadsTails.HEADS;
                break;
            case HEADS:
                ht = HeadsTails.TAILS;
                break;
        }
    }

    int getHeads() {
        return ht.ordinal();
    }

    @Override
    public String toString() {
        return "Coin{" +
                "ht=" + ht.ordinal() + " " +
                "ht=" + ht + " " +
                "order=" + order +
                '}';
    }
}
