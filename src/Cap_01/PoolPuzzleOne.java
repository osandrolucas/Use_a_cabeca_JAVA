package Cap_01;

class PoolPuzzleOne {
    public static void main(String [] args){
        int x = 0;
        System.out.println("Desafio PoolPuzzleOne");
        while ( x < 4 ){
            System.out.print("a");
            if( x < 1 ){
                System.out.print(" ");
            }
            System.out.print("n");
            if ( x > 1 ){
                System.out.print(" oyster");
                x = x + 2;
            }
            if ( x == 1 ){
                System.out.print("noys");
            }
            if ( x < 1 ){
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}