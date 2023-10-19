public interface Watch {
    public float Get_price();
    public String Get_name();

    void Set_time(Time type, int znach) throws IncorectData, InvalidType;
    void Perev(Time type, int znach) throws IncorectData, InvalidType;

}
