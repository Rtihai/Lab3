package Lab3;

public class Bishop extends ChessPiece {
    //constructor
    public Bishop(){
        super(3);
    }

    @Override
    public void move() {
        System.out.println("diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value=3}";
    }
}
