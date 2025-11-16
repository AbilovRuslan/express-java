package practice_14.task11;

public class DoorFacade {
    private DoorOpen opener = new DoorOpen();
    private DoorClose closer = new DoorClose();
    private DoorLock locker = new DoorLock();

    public void open() {
        opener.open();
    }

    public void close(){
        closer.close();
    }

    public void lock(){
        locker.lock();
    }

}
