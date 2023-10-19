import java.util.Iterator;

public class IteratorWatch implements Iterator<Watch> {
    private Watch[] watches;
    private int i = 0;
    private int size;

    public IteratorWatch(Watch[] watches, int size){
        this.watches = watches;
        this.size = size;
    }

    public boolean hasNext(){
        return i < size;
    }

    public Watch next(){
        if (hasNext()) {
            i++;
            return watches[i - 1];
        }
        else {
            return null;
        }
    }

}
