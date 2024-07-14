package bizPackage;

public class Bike {

    private String serialNo;
    private String brand;
    private String model;
    private String color;
    private FrameSize frameSize;
    private int teamID;

    //++++++++++++++++++++++Constructors++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public Bike(String brand, String model, String color, FrameSize frameSize, int teamID) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setFrameSize(frameSize);
        setTeamID(teamID);
    }

    public Bike(String serialNo, String brand, String model, String color, FrameSize frameSize, int teamID) {
        setSerialNo(serialNo);
        setBrand(brand);
        setModel(model);
        setColor(color);
        setFrameSize(frameSize);
        setTeamID(teamID);
    }

    //++++++++++++++++++++++Getter&Setter++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FrameSize getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(FrameSize frameSize) {
        this.frameSize = frameSize;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }


    //++++++++++++++++++++++Methods++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

}
