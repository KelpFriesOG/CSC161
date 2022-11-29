package jChess.board;

import java.util.HashMap;
import java.util.Map;

import jChess.pieces.Piece;

public abstract class Tile {

    protected final int coord;

    // private static final Map<Integer, EmptyTile> EMPTY_TILES =
    // createAllPossibleEmptyTiles(){
    // final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
    // for(int i = 0; ){

    // }
    // }

    Tile(int coord) {
        this.coord = coord;
    }

    public abstract boolean isOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile {

        EmptyTile(final int coord) {
            super(coord);
        }

        @Override
        public boolean isOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
    }

    public static final class OccupiedTile extends Tile {
        private final Piece piece;

        OccupiedTile(int coord, Piece piece) {
            super(coord);
            this.piece = piece;
        }

        @Override
        public boolean isOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return this.piece;
        }
    }

}
