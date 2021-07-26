package oop.interfaces.localInnerClass;

public class Door {

    public boolean isLocked(String key){

        class Lock{
            public boolean isLocked(String key){
                if(key.equals("qwerty")){
//                    System.out.println("D");
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return new Lock().isLocked(key);


    }

}
