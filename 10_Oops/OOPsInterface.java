public class OOPsInterface {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }

}

/**
 * InnerOOPsInterface
 */
interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer{

    public void moves(){
        System.out.println("up, down, left, right and diagonal(in all 4 directions)");
    }
}
/**
 * Rook implementes 
 */
class Rook implements ChessPlayer{

    public void moves(){
        System.out.println("up, down, left, right");
    }
}

/**
 * King implements
 */
class King implements ChessPlayer{
    
    public void moves(){
        System.out.println("up, down, left, right and diagonal(in all 4 directions by one steps)");
    }
}