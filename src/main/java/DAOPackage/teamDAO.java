package DAOPackage;

import bizPackage.Team;

import java.sql.SQLException;
import java.util.HashMap;

public interface teamDAO {

    void insertTeam (Team team) throws SQLException;

    HashMap<Integer, Team> getAllTeams () throws SQLException;

    Team getTeamByID (int teamID) throws SQLException;

    boolean updateTeam (Team team) throws SQLException;

    Team deleteTeam (int teamID) throws SQLException;


}
