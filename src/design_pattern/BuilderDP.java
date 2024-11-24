package design_pattern;

public class BuilderDP {
    public static void main(String args[]){
        //House house = new House("big-white","mid-brown","mid-skyblue", "medium-whiterose","ac-blug", "mid-gray","without-plant","small-onperson","normal","mid-gray");
        HouseBilder houseBilder = new HouseBilder();
        House house1 = houseBilder.setBathRoom("bathroom2")
                .setBedRoom("red-mid")
                .setStorageArea("no")
                .setDiningArea("small_white")
                .setLivingRoom("huge_gold")
                .setKichen("white_big")
                .setGarage("small")
                .setWorkersRoom("no-workers")
                .setGarden("with-grass")
                .setOfficeRoom("ac")
                .Build();
        System.out.println(house1.toString());
    }

}

class House{
    String livingRoom;
    String kichen;
    String bathRoom;
    String bedRoom;
    String officeRoom;
    String garage;
    String garden;
    String workersRoom;
    String storageArea;
    String diningArea;

    public House(String livingRoom, String kichen, String bathRoom, String bedRoom, String officeRoom, String garage, String garden, String workersRoom, String storageArea, String diningArea) {
        this.livingRoom = livingRoom;
        this.kichen = kichen;
        this.bathRoom = bathRoom;
        this.bedRoom = bedRoom;
        this.officeRoom = officeRoom;
        this.garage = garage;
        this.garden = garden;
        this.workersRoom = workersRoom;
        this.storageArea = storageArea;
        this.diningArea = diningArea;
    }

    @Override
    public String toString() {
        return "House{" +
                "livingRoom='" + livingRoom + '\'' +
                ", kichen='" + kichen + '\'' +
                ", bathRoom='" + bathRoom + '\'' +
                ", bedRoom='" + bedRoom + '\'' +
                ", officeRoom='" + officeRoom + '\'' +
                ", garage='" + garage + '\'' +
                ", garden='" + garden + '\'' +
                ", workersRoom='" + workersRoom + '\'' +
                ", storageArea='" + storageArea + '\'' +
                ", diningArea='" + diningArea + '\'' +
                '}';
    }
}

class HouseBilder{

    String livingRoom;
    String kichen;
    String bathRoom;
    String bedRoom;
    String officeRoom;
    String garage;
    String garden;
    String workersRoom;
    String storageArea;
    String diningArea;

    public HouseBilder setLivingRoom(String livingRoom) {
        this.livingRoom = livingRoom;
        return  this;
    }

    public HouseBilder setKichen(String kichen) {
        this.kichen = kichen;
       return this;
    }

    public HouseBilder setBathRoom(String bathRoom) {
        this.bathRoom = bathRoom;
        return this;
    }

    public HouseBilder setBedRoom(String bedRoom) {
        this.bedRoom = bedRoom;
        return this;
    }

    public HouseBilder setOfficeRoom(String officeRoom) {
        this.officeRoom = officeRoom;
       return this;
    }

    public HouseBilder setGarage(String garage) {
        this.garage = garage;
        return this;
    }

    public HouseBilder setGarden(String garden) {
        this.garden = garden;
        return this;
    }

    public HouseBilder setWorkersRoom(String workersRoom) {
        this.workersRoom = workersRoom;
        return this;
    }

    public HouseBilder setStorageArea(String storageArea) {
        this.storageArea = storageArea;
        return this;
    }

    public HouseBilder setDiningArea(String diningArea) {
        this.diningArea = diningArea;
        return this;
    }

    public House Build(){
        House house =  new House(this.livingRoom, this.kichen, this.bathRoom, this.bedRoom, this.officeRoom, this.garage, this.garden, this.workersRoom, this.storageArea, this.diningArea);
        this.clear();
        return house;
    }
    private void clear(){
        this.livingRoom = "default";
        this.kichen = "default";
        this.bathRoom = "default";
        this.bedRoom = "default";
        this.officeRoom = "default";
        this.garage = "default";
        this.garden = "default";
        this.workersRoom = "default";
        this.storageArea = "default";
        this.diningArea = "default";
    }
}