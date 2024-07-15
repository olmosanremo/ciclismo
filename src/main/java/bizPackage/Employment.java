package bizPackage;

import java.time.LocalDate;

public class Employment {

    private int racerID;
    private int teamID;
    private LocalDate startDate;
    private LocalDate endDate;


    //++++++++++++++++++++++Constructors++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public Employment(int racerID, int teamID, LocalDate startDate) {
        setRacerID(racerID);
        setTeamID(teamID);
        setStartDate(startDate);
    }

    public Employment(int racerID, int teamID, LocalDate startDate, LocalDate endDate) {
        setRacerID(racerID);
        setTeamID(teamID);
        setStartDate(startDate);
        setEndDate(endDate);
    }




    //++++++++++++++++++++++Getter&Setter++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public int getRacerID() {
        return racerID;
    }

    public void setRacerID(int racerID) {
        this.racerID = racerID;
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

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    //++++++++++++++++++++++Methods++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}
