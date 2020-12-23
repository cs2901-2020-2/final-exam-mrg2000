package examen.demo;

import java.util.Scanner;
import java.util.logging.Logger;

public class Blockudocku {
    static final Logger logger = Logger.getLogger(Blockudocku.class.getName());

    int [][] board = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};
    Integer totalScore = 0;

    public void printBoard(){
        for(int i=0; i < 9; i++){
            for(int j=0; j < 9; j++){
                String value = Integer.toString(board[i][j]);
                logger.info(value);
            }
            logger.info("\n");
        }
    }

    public Boolean isFila(Integer fila) {
        for(int j=0; j < 9; j++){
            if(this.board[fila][j] == 0) return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public Boolean isColumna(Integer columna) {
        for(int i=0; i < 9; i++){
            if(this.board[i][columna] == 0) return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public Boolean isBloque(Integer segmento) {
        for(int i=segmento+4; i < segmento+4; i++){
            for(int j=segmento-2; j < segmento-2; j++){
                if(board[i][j] == 0) return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public void insertABlock(String piece, Integer x, Integer y){
        char c = piece.charAt(0);
        this.board[x][y] = c;
        if(isColumna(y) || isFila(x)) totalScore += 120;
        if(Boolean.TRUE.equals(isBloque(x))) totalScore += 150;
        deleteBlock(x,y);
    }

    public Boolean startGame(Scanner scanner, Boolean gameEndBoolean){
        while(!endGame() && Boolean.TRUE.equals(gameEndBoolean)) {
            logger.info("Insert the type of piece (a,b,c,d,e,f,g,h): ");
            String piece = scanner.nextLine();
            logger.info("Type the x position of the piece (0-8): ");
            Integer x = scanner.nextInt();
            logger.info("Type the y position of the piece (0-8): ");
            Integer y = scanner.nextInt();
            insertABlock(piece, x, y);
        }
        return Boolean.TRUE;
    }

    public void deleteBlock(Integer x, Integer y){
        this.board[x][y] = 0;
    }

    public boolean endGame(){
        for(int i=0; i < 9; i++){
            for(int j=0; j < 9; j++){
                if(this.board[i][j] != 0) return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public Boolean selectNewGame(Scanner scan){
        logger.info("Write 'yes' if you want to select a new game");
        String value = scan.nextLine();
        if(value.equals("yes")){
            startGame(new Scanner(System.in), Boolean.TRUE);
            return Boolean.TRUE;
        }
        else logger.info("End of Game!");
        return Boolean.FALSE;
    }

}
