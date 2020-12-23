package examen.demo;

import java.util.Scanner;
import java.util.logging.Logger;

public class Blockudocku {
    static final Logger logger = Logger.getLogger(Blockudocku.class.getName());
    static final Scanner scanner = new Scanner(System.in);

    int [][] board = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};

    public void printBoard(){
        for(int i=0; i < 9; i++){
            for(int j=0; j < 9; j++){
                String value = Integer.toString(board[i][j]);
                logger.info(value);
            }
            logger.info("\n");
        }
    }

    public void selectNewGame(){
        logger.info("Write 'yes' if you want to select a new game");
        String value = scanner.nextLine();
    }

}
