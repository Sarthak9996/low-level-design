package chess.chess;

import java.util.List;

public class CHESS {
	ChessBoard chessBoard;
	Player[] player;
	Player currentPlayer;
	List<Move> movesList;
	GameStatus gameStatus;

	public boolean playerMove(CellPosition fromPosition, CellPosition toPosition, Piece piece) {
		changeTurn();
		return false;
	}

	public boolean endGame() {
		return false;
	}

	private void changeTurn() {
	}
}

class Player {
	Account account;
	Color color;
	Time timeLeft;
}

class Account {
	String username;
	String password;

	String name;
	String email;
	String phone;
}

enum Color {
	BLACK, WHITE;
}

class Time {
	int mins;
	int secs;
}

enum GameStatus {
	ACTIVE, PAUSED, BLACK_WIN, WHITE_WIN, FORTFEIGHT
}

class ChessBoard {

	List<List<Cell>> board;

	public void resetBoard() {
	}

	public void updateBoard(Move move) {
	}
}

class Cell {
	Color color;
	Piece piece;
	CellPosition position;
}

class CellPosition {
	char ch;
	int i;
}

class Move {
	Player turn;
	Piece piece;
	Piece killedPiece;
	CellPosition startPosition;
	CellPosition endPosition;

}

abstract class Piece {
	Color color;

	public abstract boolean move(CellPosition fromPosition, CellPosition toCellPosition);

	public abstract List<CellPosition> possibleMoves(CellPosition fromPosition);

	public abstract boolean validate(CellPosition fromPosition, CellPosition toPosition);
}

class Knight extends Piece {
	public boolean move(CellPosition fromPosition, CellPosition toCellPosition) {
		return false;
	}

	public List<CellPosition> possibleMoves(CellPosition fromPosition) {
		return null;
	}

	public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
		return false;
	}
}

class Bishop extends Piece {
	public boolean move(CellPosition fromPosition, CellPosition toCellPosition) {
		return false;
	}

	public List<CellPosition> possibleMoves(CellPosition fromPosition) {
		return null;
	}

	public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
		return false;
	}
}

class Rook extends Piece {
	public boolean move(CellPosition fromPosition, CellPosition toCellPosition) {
		return false;
	}

	public List<CellPosition> possibleMoves(CellPosition fromPosition) {
		return null;
	}

	public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
		return false;
	}
}

class King extends Piece {
	public boolean move(CellPosition fromPosition, CellPosition toCellPosition) {
		return false;
	}

	public List<CellPosition> possibleMoves(CellPosition fromPosition) {
		return null;
	}

	public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
		return false;
	}
}

class Queen extends Piece {
	public boolean move(CellPosition fromPosition, CellPosition toCellPosition) {
		return false;
	}

	public List<CellPosition> possibleMoves(CellPosition fromPosition) {
		return null;
	}

	public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
		return false;
	}
}

class Pawn extends Piece {
	public boolean move(CellPosition fromPosition, CellPosition toCellPosition) {
		return false;
	}

	public List<CellPosition> possibleMoves(CellPosition fromPosition) {
		return null;
	}

	public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
		return false;
	}
}