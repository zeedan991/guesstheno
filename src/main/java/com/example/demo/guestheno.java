package com.example.demo;

import java.io.Serializable;
import java.util.Random;

class game implements Serializable {
    int user_input;
    int comp_input;
    int countnumberr; // Ensure 'static' is removed

    game() {
        Random rm = new Random();
        this.comp_input = rm.nextInt(101);
        this.countnumberr = 0;
    }

    public String checkCondition(int input) {
        this.user_input = input;
        this.countnumberr++;

        if (user_input == comp_input) {
            return "WON";
        } else if (user_input > comp_input) {
            return "COMPUTER VALUE IS LESS THAN : " + user_input;
        } else {
            return "COMPUTER VALUE IS GREATER THAN : " + user_input;
        }
    }
}

public class guestheno {
    public static void main(String[] args) {

    }
}