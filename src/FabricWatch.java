public class FabricWatch {
    static public Watch new_watch(Type typ, String name, float price)  {
        switch (typ) {
            case SimpelWatch:
                return new SimpelWatch(name, price);
            case AccurateWatch:
                return new AccurateWatch(name, price);
        }
        return null;
    }
}
