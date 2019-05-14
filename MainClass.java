package project01;

import project01.controller.Controller;
import project01.view.View;

public class MainClass {

    public static void main(String[] args) {
            new Controller(new View()).welcomeMenu();
    }
}

