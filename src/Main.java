import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class Main {
    public static void main(String[] args) {





        Watch MyWatch = FabricWatch.new_watch(Type.SimpelWatch,"wach1",2000);
        Watch WallWatch =  FabricWatch.new_watch(Type.AccurateWatch,"wach2",110);
        try {
            MyWatch.Set_time(Time.Hour,12);
            MyWatch.Set_time(Time.Minut, 32);

            WallWatch.Set_time(Time.Hour,14);
            WallWatch.Set_time(Time.Minut,25);
            WallWatch.Set_time(Time.Sec,12);

        }catch (InvalidType | IncorectData error){
            System.out.println(error);
        }



        ContainerWatch a = new ContainerWatch();
        a.add(WallWatch);
        a.add(MyWatch);

        IteratorWatch it = a.iterator();
        while(it.hasNext()){
            Watch temp = it.next();
            System.out.println(temp);
            try {
                temp.Set_time(Time.Hour, 1);
            }catch (InvalidType | IncorectData error){
                System.out.println(error);
            }
        }
        for (Watch t: a){
            System.out.println(t);
        }



//
//
//        System.out.println(MyWatch.Get_name() + " цена: " + MyWatch.Get_price() + ", показывают: " + MyWatch);
//        System.out.println(WallWatch.Get_name() + " цена: " + WallWatch.Get_price() + ", показывают: " + WallWatch);
//
//        try{
//            MyWatch.Perev(Time.Hour,2);
//            MyWatch.Perev(Time.Minut, 40);
//
//            WallWatch.Perev(Time.Hour,3);
//            WallWatch.Perev(Time.Minut,50);
//            WallWatch.Perev(Time.Sec,1);
//        }catch(InvalidType | IncorectData error){
//            System.out.println(error);
//        }
//
//        System.out.println(MyWatch.Get_name() + ": " + MyWatch);
//        System.out.println(WallWatch.Get_name() + ": " + WallWatch);
//
//        try{
//            MyWatch.Perev(Time.Hour,-2);
//
//        }catch(InvalidType | IncorectData error){
//            System.out.println(error);
//        }

    }
}