package Lab3;

import java.util.Objects;

public abstract class ChessPiece {
    private int value;

    public ChessPiece(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract void move();

    @Override
    public boolean equals(Object objectInstance) {
        if(this == objectInstance){
            return true;
        }
        if(objectInstance == null || getClass() != objectInstance.getClass()){
            return false;
        }
        ChessPiece that = (ChessPiece) objectInstance;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ChessPiece{value=" + value + "}";
    }

    public abstract void promote(ChessPiece cp2);

}
