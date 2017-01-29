package com.company;

import java.util.Scanner;

public class Main {
    public static Character player;
    public static Story story;



            public static void main(String[] args){
                Scanner in=new Scanner(System.in);
                System.out.println("На случай смерти похоронить под именем  '...' (ваше имя):");
                player = new Character(in.next());
                story = new Story();
                int current = 0;
                while (true){
                    if(current == 6)
                    {
                        System.out.println("====================the end!=============");
                        return;
                    }
                    System.out.println("============="+story.Situations[current].subject+"========");

                    System.out.println(story.Situations[current].text);

                    current = story.Situations[current].choices[in.nextInt()-1];
                }
            }
    }

