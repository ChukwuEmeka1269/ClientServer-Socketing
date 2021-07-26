package oop.interfaces.innerClasses;

public class Door {
    private Lock lock;

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Door() {
        lock = new Lock(true);
    }


    public Lock getLock() {
        return lock;
    }

    public void shopStatus(){
        if(lock.isLock()){
            System.out.println("We are currently closed. Please come back later. Thanks");
        }
        else{
            System.out.println("Welcome to Rexco inc.");
        }
    }

    class Lock{
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }

}
