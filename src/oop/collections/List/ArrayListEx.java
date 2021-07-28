package oop.collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static List<String> names = new ArrayList<>();
    public static void main(String[] args) {
        ArrayListEx object = new ArrayListEx();
        names.add("Emeka");
        names.add("Emmanuel");
        names.add("John");
        names.add("Raphael");
        names.add("Mel");
        names.add("Emerald");


        object.addToList("Ovunda");
        object.addToList("Ebere");
        object.addToList("Rowland");
        object.displayNames(names);
        System.out.println("*********");

        object.editData( "Mike", "Dick");


    }

    public void displayNames(List<String> names){
        for(int index=0; index< names.size(); index++){
            System.out.println(index+1 + ". " + names.get(index));
        }
    }

    public void removeNameByIndex(int index){
        names.remove(index);
        System.out.println("Name at index position" + index + " has been removed from list.");
    }

    public void removeNameByString(String name){
        names.remove(name);
        System.out.println( name + " has been removed from list.");
    }

    public void addToList(String name){
        names.add(name);
    }

    void editData(String oldName, String newName){
        int index = searchName(oldName);
        if(index != -1){
            names.set(index, newName);
            System.out.println(oldName + " at index position " + index + ", has been changed to " + newName +
                    ". \nDisplay names to see current changes.");
        }
        else{
            System.out.println("Name not found!");
        }
    }

    int searchName(String name){
        return names.indexOf(name);
    }


}
