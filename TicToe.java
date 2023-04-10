import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    char [][] board = new char[3][3];
    for(int i = 0 ; i < 3 ; i++){
        for(int j =0 ;j < 3; j++){
            board[i][j] = '.';
        }
    }
    Scanner  scn = new Scanner(System.in);
    
    boolean firstPlayer = true ;
    boolean gameOver = false;
    while(!gameOver){
        System.out.println();
    showBoard(board);
    System.out.println();
    System.out.println("Enter Cordinate X");
        int x = scn.nextInt();
        System.out.println("Enter Cordinate y");
        int y = scn.nextInt();
         System.out.println("X Or 0");
        char xoro = scn.next().charAt(0);
        System.out.println("your sign"+ xoro);
        board [x][y] = xoro;
        if(checkWinner(board,'X')){
            if (firstPlayer) {
                System.out.println("First Player WOn the Game");
                System.out.println();
            } else {
                System.out.println("Second Player Won the Game");
                System.out.println();
           }
           gameOver = true;
            System.out.println();
            showBoard(board);
            System.out.println();
        }else{
            firstPlayer = !firstPlayer;
        }
    }
        showBoard(board);
    }
    
    public static boolean checkWinner(char[][] board, char currTurn) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == currTurn && board[i][1] == currTurn && board[i][2] == currTurn)
                return true;
        }

        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == currTurn && board[1][j] == currTurn && board[3][j] == currTurn)
                return true;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == j) {
                    if (board[i][j] == currTurn) {
                        count++;
                    }
                }
            }
        }
        if (count == 3)
            return true;

        if (board[0][2] == currTurn && board[1][1] == currTurn && board[2][0] == currTurn)
            return true;
        return false;
    }
    
    
    public static void showBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
