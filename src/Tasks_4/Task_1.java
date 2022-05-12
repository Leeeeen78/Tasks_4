package Tasks_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task_1 {
    public static void main(String[] args) {
        String[] colors = {"red", "black", "green", "white", "blue", "grey", "pink"};
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.addAll(Arrays.asList(colors));
        colorsList.remove(2);
        colorsList.add(colorsList.size() - 1, "yellow");
        System.out.println(colorsList);
        System.out.println();

        colorsList.add(0, "orange");

        System.out.println("Colors in the colorsList");

        for (String s : colors) {
            System.out.println(s);
        }
        System.out.println();

        ArrayList<String> colorSubList = new ArrayList(colorsList.subList(2, 5));
        System.out.println("Colors in the colorsSubList");
        for (int i = 0; i < colorSubList.size(); i++) {
            System.out.println(colorSubList.get(i));
        }

    }

}



