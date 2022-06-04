import java.util.*;

public class GameBoard {
    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Jumper> ladder;
    private List<Jumper> snake;
    private Map<String, Integer> playerCurrentPossition;
    int boardSize;

    GameBoard(Dice dice,  List<Jumper> snake,Queue<Player> nextTurn, List<Jumper> ladder, Map<String, Integer> playerCurrentPossition,
            nt boardSize) {
        this.dice = dice;
        this.snake = snake;
        this.nextTurn = nextTurn;
        this.ladder = ladder;
        this.playerCurrentPossition = playerCurrentPossition;
        this.boardSize = boardSize;

    }

    void startGame() {
        while (nextTurn.size() > 1) {
            Player player = nextTurn.poll();
            int diceValue = dice.Roll();
            int currentPosition = playerCurrentPossition.get(player.getplayerName());
            int nextMove = diceValue + currentPosition;
            if (nextMove > boardSize)
                nextTurn.offer(player);
            else if (boardSize == nextMove) {
                System.out.print(player.getplayerName());
            } else {
                int nextPosition[] = new int[1];
                boolean b[] = new boolean[1];
                nextPosition[0] = nexMove;
            
            }
        }
        
    }

}

