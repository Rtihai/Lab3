package Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ChessPiece cp1 = new Bishop();
        ChessPiece cp2 = new King();
        ChessPiece cp3 = new Knight();
        ChessPiece cp4 = new Pawn();
        ChessPiece cp5 = new Queen();
        ChessPiece cp6 = new Rook();

        ArrayList<ChessPiece> pieces = new ArrayList<>();
        pieces.add(cp1);
        pieces.add(cp2);
        pieces.add(cp3);
        pieces.add(cp4);
        pieces.add(cp5);
        pieces.add(cp6);

        for(ChessPiece piece: pieces){
            System.out.println(piece + ": ");
            piece.move();
        }

        ((Pawn) cp4).promote(cp2);

        Pawn newPawn = new Pawn();
        System.out.println(newPawn.equals(cp4));

        ((Pawn) cp4).promote(cp3);
        System.out.println(newPawn.equals(cp4));
    }
}
