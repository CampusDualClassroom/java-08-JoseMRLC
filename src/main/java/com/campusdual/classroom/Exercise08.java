package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
int x = 0;
int y = num;
        while(x<y){


            System.out.println(x + " < " + y + ". El proximo ciclo valdra: " + (x + 1));
            x = x+1;
        }
    }
}