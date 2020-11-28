/*


The essence of the problem is "can the current player move the game to a 'no-win' state?"

For the particular game referenced here, the no-win states can be enumerated by starting at the north-west corner of the board and then working backwards.

(0,0) (0,1) (1,0) and (1,1) are all squares that force a loss on the next move. If you can manuever the knight to one of those squares you will win.

If not, your opponent will move to one of those squares and you will lose.

The rest of the logic flows from there.

Note that my solution is correct for 15x15 (and 8x8), but not for all boards of all sizes. For example, it would not be correct for a 9x9 board.

*/

    // Complete the chessboardGame function below.
    static String chessboardGame(int x, int y) {
        x=x%4; 
        y=y%4;
        if((y==0)||(y==3)||(x==0)||(x==3)) return "First";
        return "Second";

    }
