package Classes;

public class ControleRemoto {
    
    public void aumetar_volume(Televisao tv){
        tv.aumetar_volume();
    }
    
    public void diminuir_volume(Televisao tv){
        tv.diminuir_volume();
    }

    public void next_canal(Televisao tv){
        tv.next_canal();
    }

    public void previ_canal(Televisao tv){
        tv.previ_canal();
    }

    public void set_canal(Televisao tv, int num_canal){
        tv.set_canal(num_canal);
    }

    public void get_info(Televisao tv){
        tv.get_info();
    }
    
}
