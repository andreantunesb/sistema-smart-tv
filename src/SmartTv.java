public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal){
        canal=novoCanal;  
    }

    public void diminuirCanal(){
        canal--;
    }
    
    public void aumentarCanal(){
        canal++;
    }

    public void aumentarVolume(){
        volume++;
        //igual a dizer volume = volume +1
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        //igual a dizer volume = volume -1
        System.out.println("Diminuindo o volume para: " + volume);
    }


    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
