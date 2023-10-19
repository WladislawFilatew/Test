import java.security.PublicKey;

public class ShopWatch {

    private String title;
    public String GetTitle(){return title;}
    public void SetTitele(String title){this.title = title;}

    private String Owner;
    public String GetOwner(){return Owner;}
    public void SetOwner(String Owner){this.Owner = Owner;}

    ContainerWatch Watchs;

    public ShopWatch(String title, String Owner) {
        this.title = title;
        this.Owner = Owner;
        Watchs = new ContainerWatch();
    }
}
