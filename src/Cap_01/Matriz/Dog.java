package Cap_01.Matriz;

public class Dog {
    public static void main(String[] args) {
        //criando um objeto dog e acessando
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Ferrugem";
        //agora criamos uma matriz
        Dog[] myDogs = new Dog[3];
        //E colocamos alguma coisa dentro dela
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //agora acessa os objetos dog
        //usando as referencias da matriz
        myDogs[0].name = "Amora";
        myDogs[1].name = "Baby";
        //Humm... qual é o nome de myDogs[2]?
        System.out.println("O nome do último cão é ");
        System.out.println(myDogs[2].name);
        //agora executa um loop pela matriz
        //e pede para todos os caes latirem
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println( name + "diga Ruff!!");
    }

    public void eat() {}
    public void chaseCat() {}
}
