package structural.facade;

public class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvdRom.load();
        hdd.copyData(dvdRom);
    }
}
