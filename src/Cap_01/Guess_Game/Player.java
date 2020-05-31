package Cap_01.Guess_Game;

public class Player {
    int number = 0; //Onde entra o palpite

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Estou pensando em .... " + number);
    }
}
