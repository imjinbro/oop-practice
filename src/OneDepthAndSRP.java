/* 코드 가독성 높이기, 뎁스 줄여서 리팩토링 쉽게 하기, 1가지 역할만 하도록 만들기 */
public class OneDepthAndSRP {
    public static void main(String[] args) {
        Board board = new Board();
        BoardViewer.viewBoard(board);
    }
}

class Board {
    private int[][] board;

    Board() {
        initBoard(10, 10);
    }

    private void initBoard(int height, int width) {
        board = new int[height][width];
    }

    String convertBoardForView() {
        StringBuilder builder = new StringBuilder();

        for (int height = 0; height < board.length; height++) {
            builder.append(convertEachHeight(height, board[height].length));
            builder.append("\n");
        }

        return builder.toString();
    }

    private String convertEachHeight(int height, int width){
        StringBuilder builder = new StringBuilder();
        for (int pos = 0; pos < width; pos++) {
            builder.append(board[height][pos]);
        }
        return builder.toString();
    }
}

class BoardViewer {
    static void viewBoard(Board board){
        System.out.println(board.convertBoardForView());
    }
}
