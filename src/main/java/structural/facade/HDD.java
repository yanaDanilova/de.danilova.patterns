package structural.facade;

public class HDD {

    public void copyData(DVDRom dvdRom){
        if(dvdRom.hasData()){
            System.out.println("data is being copied");
        }
        else {
            System.out.println("insert the data into DVDRom");
        }

    }
}
