package isp.lab6.exercise2;


public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {
        this.serialNumber = serialNumber;
        name = "bbb";
        owner = null;
        taken = false;
    }

    public Equipment(String name, String serialNumber) {
        this.serialNumber = serialNumber;
        this.name = name;
        owner = null;
        taken = false;
    }

    public Equipment(String name, String serialNumber, String owner) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.owner = owner;
        taken = true;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }

    /**
     * Provide the owner of the equipment
     * Equipment should be set as taken
     *
     * @param owner - owner name
     */
    public void provideEquipmentToUser(final String owner) {
        taken = true;
        this.owner = owner;
    }

    /**
     * Equipment is returned to the office
     * Equipment should not be set as taken
     * Remove the owner
     */
    public void returnEquipmentToOffice() {
        taken = false;
        this.owner = null;
    }
}
