package bizPackage;

import java.time.LocalDate;

public class Racer {

    private int racerID;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private int addressID;

    private String nationality;

    private int teamID;

    private LocalDate startDate;


    //++++++++++++++++++++++Constructors++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public Racer(String firstName, String lastName, LocalDate dateOfBirth, int addressID, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setAddressID(addressID);
        setNationality(nationality);
    }

    public Racer(String firstName, String lastName, LocalDate dateOfBirth, int addressID, String nationality, int teamID, LocalDate startDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setAddressID(addressID);
        setNationality(nationality);
        setTeamID(teamID);
        setStartDate(startDate);
    }

    public Racer(int racerID, String firstName, String lastName, LocalDate dateOfBirth, int addressID, String nationality) {
        setRacerID(racerID);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setAddressID(addressID);
        setNationality(nationality);
    }

    public Racer(int racerID, String firstName, String lastName, LocalDate dateOfBirth, int addressID, String nationality, int teamID, LocalDate startDate) {
        setRacerID(racerID);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setAddressID(addressID);
        setNationality(nationality);
        setTeamID(teamID);
        setStartDate(startDate);
    }

    //++++++++++++++++++++++Getter&Setter++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    public int getRacerID() {
        return racerID;
    }

    public void setRacerID(int racerID) {
        this.racerID = racerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    //++++++++++++++++++++++Methods++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


}
