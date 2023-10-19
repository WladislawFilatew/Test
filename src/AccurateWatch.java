public class AccurateWatch extends SimpelWatch{
    private int sec;
    public void  Set_sec(int sec){this.sec = sec;}
    public int Get_sec(){return sec;}
    public AccurateWatch(String name, float price){
        super(name,price);
    }

    @Override
    public String toString(){
        return "" + hour + ":" + minut + ":" + sec;
    }


    @Override
    public void Set_time(Time type,int znach) throws IncorectData,InvalidType{
        if (znach < 0)
            throw new IncorectData();
        try {
            super.Set_time(type, znach);
        }catch (InvalidType temp){
            switch (type){
                case Sec:
                    if (znach > 60)
                        throw new IncorectData();
                    this.sec = znach;
                    break;
                default:
                    throw new InvalidType();
            }
        }
    }
    @Override
    public void Perev(Time type, int znach) throws IncorectData, InvalidType{
        if (znach < 0)
            throw new IncorectData();
        try {
            super.Perev(type, znach);
        }catch (InvalidType temp){
            switch (type){
                case Sec:
                    this.sec += znach;
                    super.Perev(Time.Minut,sec / 60);
                    sec %= 60;
                    break;
                default:
                    throw new InvalidType();
            }
        }
    }

}
