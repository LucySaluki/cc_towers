public class Equipment {
    private int numberOfItems;
    private EquipmentType equipmentType;

    public Equipment(int numberOfItems, EquipmentType equipmentType){
        this.numberOfItems=numberOfItems;
        this.equipmentType=equipmentType;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

}
