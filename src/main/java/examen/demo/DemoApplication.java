package examen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Blockudocku blockudocku = new Blockudocku();
        blockudocku.printBoard();
        blockudocku.selectNewGame(new Scanner(System.in));
    }

}
