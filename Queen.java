package Lab3;

public class Queen extends ChessPiece {
    //constructor
    public Queen(){
        super(9);
    }

    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }

    @Override
    public String toString() {
        return "Queen{value=9}";
    }
}
