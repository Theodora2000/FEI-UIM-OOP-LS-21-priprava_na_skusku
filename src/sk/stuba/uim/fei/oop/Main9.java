package sk.stuba.uim.fei.oop;

import java.io.File;

public class Main9 {
    public static void main(String args[]){

        File dir = new File("C:\\Users\\WIN10\\Desktop\\FEI\\4.semeter\\OOP\\Priprava na skusku\\FEI-UIM-OOP-LS-21-priprava_na_skusku\\src\\sk\\stuba\\uim\\fei\\oop");
        String[] list = dir.list();
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
