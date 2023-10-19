public class SimpelWatch implements Watch {
    protected String name;
    protected float price;
    protected int hour;
    protected int minut;
    public float Get_price(){return price;}
    public String Get_name(){return name;}

    public SimpelWatch(String name, float price){
        this.name = name;
        this.price = price;
    }
    public void Set_minut(int minut){this.minut = minut;}
    public void  Set_hour(int  hour) {this.hour = hour;}

    public int Get_minut(){return minut;}
    public int  Get_hour() {return hour;}

    @Override
    public String toString(){
        return "" + hour + ":" + minut;
    }


    public void Set_time(Time type,int znach) throws IncorectData, InvalidType{
        if (znach < 0)
            throw new IncorectData();
        switch (type){
            case Hour:
                if (znach > 24)
                    throw new IncorectData();
                hour = znach;
                break;
            case Minut:
                if (znach > 60)
                    throw new IncorectData();
                minut = znach;
                break;
            default:
                throw new InvalidType();
        }
    }
    public void Perev(Time type, int znach)throws IncorectData, InvalidType{
        if (znach < 0)
            throw new IncorectData();
        switch (type){
            case Hour:
                hour = (hour + znach) % 24;
                break;
            case Minut:
                this.minut += znach;
                hour = (hour + this.minut / 60) % 24;
                this.minut %= 60;
                break;
            default:
                throw new InvalidType();
        }
    }
}
