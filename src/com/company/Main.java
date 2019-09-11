package com.company;

import com.company.Tandbørste;

public class Main {
        public static void main(String[] args) {

            
            Tandbørste sunesTandborste = new Tandbørste();
            sunesTandborste.start();
            //@TODO Lav test

            if (sunesTandborste.erStartede == true) System.out.println(" pass");
            else System.out.println("fail");

        }
    }
