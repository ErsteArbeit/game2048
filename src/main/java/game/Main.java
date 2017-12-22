package game;

import game.Controller;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ich arbeite ersten mal an GitHub!");
        System.out.println();
        Model model = new Model();
        Controller controller = new Controller(model);
        JFrame game = new JFrame();

        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        game.add(controller.getView());


        game.setLocationRelativeTo(null);
        game.setVisible(true);

    }
}