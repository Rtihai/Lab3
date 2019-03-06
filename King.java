package Lab3;

public class King extends ChessPiece {

    public King() {
        super(1000);
    }

    @Override
    public void move() {
        System.out.println("one Square");
    }

    @Override
    public String toString() {
        return "King{value=1000}";
    }
}
