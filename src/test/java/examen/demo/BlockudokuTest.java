package examen.demo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class BlockudokuTest {

    @Test
    public void startGameTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        int [][] board = blockudocku.board;
        blockudocku.printBoard();
        Assert.assertEquals(board[0][0], 0);
    }

    @Test
    public void endGameTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        for(int i=0; i < 9; i++){
            for(int j=0; j < 9; j++){
                blockudocku.board[i][j] = 9;
            }
        }
        Assert.assertFalse(blockudocku.endGame());
    }

    @Test
    public void insertBlockTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        blockudocku.insertABlock("a",2,3);
        Assert.assertEquals(blockudocku.board[2][3], 0);
    }

    @Test
    public void startAndEndGameTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        Assert.assertEquals(blockudocku.startGame(new Scanner(" "), Boolean.FALSE), Boolean.TRUE);
    }

    @Test
    public void startGameTestTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        String piece = "a";
        Integer x = 2;
        Integer y = 3;
        Assert.assertTrue(blockudocku.startGame(new Scanner(" "), Boolean.TRUE));
    }

    @Test
    public void selectNewGameTrueTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        String input = "yes";
        Assert.assertTrue(blockudocku.selectNewGame(new Scanner(input)));
    }

    @Test
    public void selectNewGameFalseTestCase() {
        Blockudocku blockudocku = new Blockudocku();
        String input = " ";
        Assert.assertFalse(blockudocku.selectNewGame(new Scanner(input)));
    }

    @Test
    public void piecesTestCase() {
        Piezas piezas = new Piezas();
        int[][] piezaA = {{1,1,0},{1,1,0},{0,0,1}};
        int[][] piezaB = {{1,1,0},{1,1,0},{0,0,1}};
        int[][] piezaC = {{0,1,0},{0,1,0},{1,0,1}};
        int[][] piezaD = {{0,1,0},{0,1,0},{0,0,1}};
        int[][] piezaE = {{0,1,0},{0,1,0},{0,0,1}};
        int[][] piezaF = {{1,1,0},{1,1,0},{0,0,1}};
        int[][] piezaG = {{1,1,0},{0,1,1},{0,0,1}};
        int[][] piezaH = {{0,0,0},{0,1,0},{0,0,1}};
        Assert.assertEquals(piezas.piezaA(), piezaA);
        Assert.assertEquals(piezas.piezaB(), piezaB);
        Assert.assertEquals(piezas.piezaC(), piezaC);
        Assert.assertEquals(piezas.piezaD(), piezaD);
        Assert.assertEquals(piezas.piezaE(), piezaE);
        Assert.assertEquals(piezas.piezaF(), piezaF);
        Assert.assertEquals(piezas.piezaG(), piezaG);
    }
}
