import javax.imageio.event.IIOWriteWarningListener;
import java.awt.*;
import java.util.Collection;

public class ContainerWatch  implements Iterable<Watch>{
    private Watch[] Watchs;
    private int size = 0;


    public int size(){return size;}

    private int capacity;
    public int Capacit(){return capacity;}



    public boolean isEmpty(){
        if (size == 0)
            return true;
        return false;
    }





    public ContainerWatch()  {
        capacity = 10;
        Watchs = new Watch[capacity];
    }
    public boolean add(Watch watch){
        if (size == capacity) {
            capacity *= 2;
            Watch[] temp = new Watch[capacity];
            for (int i = 0; i < size; i++)
                temp[i] = Watchs[i];
            Watchs = temp;
        }
        Watchs[size] = watch;
        size++;
        return true;
    }

    public Watch at(int index){
        if (index < 0 || index >= size)
           return null;
        return Watchs[index];
    }

    public IteratorWatch iterator(){
        return new IteratorWatch(Watchs,size);
    }




}
