package oop.interfaces.anonymousInnerClass;



abstract class Lock{
    public abstract boolean isUnlocked(String key);
    public void test(){
        System.out.println("test");
    }

    public void prove(){
        System.out.println("Yayy!! It works.");
    }


}

public class Door {

    Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String key) {
            if(key.equals("qwerty")){
                System.out.println("Welcome to Rexco Inc.");
                return true;
            }
            else {
                System.out.println("Wrong key.");
                return  false;
            }
        }
    };

    public Lock getLock() {
        return lock;
    }
}
