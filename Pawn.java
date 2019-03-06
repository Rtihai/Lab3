package Lab3;

import java.util.Objects;

public class Pawn extends ChessPiece {
    private boolean hasbenPromoted;
    private ChessPiece newPiece;

    public Pawn() {
        super(1);
        this.hasbenPromoted = false;
    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    public void promote(ChessPiece newPiece) {
        if(hasbenPromoted == true) {
            System.out.println("already been promoted!");
            return;
        }
        if(newPiece.getValue() == 1000 || newPiece.getValue() == 1) {
            System.out.println("Invalid promotion!");
            System.out.println("You cannot promote to a King or Pawn.");
            return;
        }

        this.newPiece = newPiece;
        hasbenPromoted = true;
        System.out.println("Promoted to "+ newPiece);
    }

    @Override
    public boolean equals(Object objectInstance) {
        if(this == objectInstance) {
            return true;
        }
        if(objectInstance == null || getClass() != objectInstance.getClass()){
            return false;
        }
        if(super.equals(objectInstance)) {
            return false;
        }
        Pawn pawn = (Pawn) objectInstance;
        return hasbenPromoted == pawn.hasbenPromoted && Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Pawn {" + "has been promoted" + hasbenPromoted + "to new Piece= " + newPiece + "}";
    }
}
