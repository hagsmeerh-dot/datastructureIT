public class xoro
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // طباعة اللوحة
    static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    // فحص الفوز
    static boolean checkWin(char player) {
        // الصفوف
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player)
                return true;
        }

        // الأعمدة
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                    board[1][j] == player &&
                    board[2][j] == player)
                return true;
        }

        // الأقطار
        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player)
            return true;

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player)
            return true;

        return false;
    }

    // فحص التعادل
    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char currentPlayer = 'X';

        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + " enter row and column (0-2):");

            int row = input.nextInt();
            int col = input.nextInt();

            // التحقق من صحة الحركة
            if (board[row][col] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            // فحص الفوز
            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // فحص التعادل
            if (isDraw()) {
                printBoard();
                System.out.println("Draw!");
                break;
            }

            // تبديل اللاعب
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        input.close();
    }
}{
}
