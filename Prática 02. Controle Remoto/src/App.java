import Classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Televisao tv = new Televisao();
        ControleRemoto control = new ControleRemoto();

        control.aumetar_volume(tv);
        control.aumetar_volume(tv);

        control.set_canal(tv, 3);

        control.get_info(tv);
    }
}
