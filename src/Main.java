import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WhileLoopFun fun = new WhileLoopFun();

        System.out.println("-- test countLetter --");
        System.out.println(fun.countLetter("apple", "a"));
        System.out.println(fun.countLetter("apple", "z"));
        System.out.println(fun.countLetter("babababa", "a"));
        System.out.println(fun.countLetter("babababa", "b"));
        System.out.println(fun.countLetter("excellente", "e"));
        System.out.println(fun.countLetter("rawrrrrrr", "r"));



    }
}
