package bizPackage;

public class Team {

    private int teamID;
    private String teamName;
    private String licenseNo;
    private int addressID;


    //++++++++++++++++++++++Constructors++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public Team(String teamName, String licenseNo, int addressID) {
        setTeamName(teamName);
        setLicenseNo(licenseNo);
        setAddressID(addressID);
    }

    public Team(int teamID, String teamName, String licenseNo, int addressID) {
        setTeamID(teamID);
        setTeamName(teamName);
        setLicenseNo(licenseNo);
        setAddressID(addressID);
    }
    //++++++++++++++++++++++Getter&Setter++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }


    //++++++++++++++++++++++Methods++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



}
