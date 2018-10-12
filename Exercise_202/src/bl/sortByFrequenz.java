package bl;

import java.util.Comparator;

public class sortByFrequenz implements Comparator<Sender> {

    @Override
    public int compare(Sender t, Sender t1) {
        if (t.getFrequenz() < t1.getFrequenz()) {
            return -1;
        }

        if (t.getFrequenz() > t1.getFrequenz()) {
            return 1;
        }

        return 0;
    }

}
