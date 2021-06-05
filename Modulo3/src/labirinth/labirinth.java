package labirinth;

import java.util.Arrays;
import java.util.Scanner;

public class labirinth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char maze[][]=creaLabirinto();
        for (int i = 0; i < 5; i++)
            System.out.println(Arrays.toString(maze[i]));
        System.out.println("inserisci move:");
        String movement="";
                movement= input.nextLine();
        movimento(movement);


    }


    public static char[][] creaLabirinto() {
        char[][] maze = {
                {'-', '-', 'W', '-', '-'},
                {'P', '-', 'W', '-','-'},
                        {'-', '-', '-', '-', 'E'},
                        {'-', '-', 'W', '-', '-'},
                        {'-', '-', 'W', '-', '-'},
                };
        return maze;

    }



        public static void movimento (String move){

            switch (move.charAt(0)) {
                case 'W':
                    System.out.println("sposta su");
                    break;
                case 'A':
                    System.out.println("sposta dx");
                    break;
                case 'S':
                    System.out.println("sposta giu");
                    break;
                default:
                    System.out.println("movimento non valido");
                    break;
            }
        }
    }