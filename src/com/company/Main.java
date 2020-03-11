package com.company;

public class Main {
    //Creating an object for the tic tac toe board
    public static void main(String[] args) {

        // Creating the tic tac toe board with an array
        char[][]ticBoard = {{' ','|',' ','|',' ',},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};
        // Creating this so the console knows to take inputs and put them on the board
        Scanner scan = new Scanner(System.in);
        int place = scan.nextInt();
        System.out.println(place);
        placePiece(ticboard, place, "user");
        random random = new Random();

        int cpuPos = rand.nextInt(9) + 1;
        System.out.println("Make your move" (1-9):");
        print ticBoard(ticBoard);
        //Creating a loop for the board, for every symbol on the x axis, make a symobol on the y axis.
        for(char[] row : ticBoard) {
            for(char array : row) {
                System.out.print(array);
            }System.out.println();
        }




    }
}
