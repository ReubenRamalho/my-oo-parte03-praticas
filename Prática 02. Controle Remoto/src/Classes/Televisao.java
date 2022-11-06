package Classes;

public class Televisao {
    private int volume = 30, num_canal = 0;
    private final String[] list_canal = {"Canal de Notícias", "Canal de Culinária", "Canal de Esportes", "Canal de Documentarios","Canal de Desenhos"};
    
    protected void aumetar_volume(){
        this.volume += 1;
    }

    protected void diminuir_volume(){
        this.volume -= 1;
    }

    protected void next_canal(){
        this.num_canal ++;
        if(num_canal == 5)
            this.num_canal = 0;
    }

    protected void previ_canal(){
        this.num_canal --;
        if(num_canal == -1)
            this.num_canal = 4;
    }

    protected void set_canal(int num_canal){
        if((0 <= num_canal) && (num_canal <= 5))
            this.num_canal = num_canal;
        else{
            System.out.println("\nNúmero de canal Inválido. Voltanto para o canal 0...");
            this.num_canal = 0;
        }    
    }

    protected int get_num_canal(){
        return num_canal;
    }

    protected void get_info(){
        System.out.println(
        "\nVolume: " + volume +
        "\nNúmero do canal: " + num_canal +
        "\nCanal: " + list_canal[num_canal]);
    }
}
