package DAOPackage;

import bizPackage.Team;

import java.sql.SQLException;
import java.util.HashMap;

public class teamDAOImpl implements teamDAO{
    @Override
    public void insertTeam(Team team) throws SQLException {

    }

    @Override
    public HashMap<Integer, Team> getAllTeams() throws SQLException {
        return null;
    }

    @Override
    public Team getTeamByID(int teamID) throws SQLException {
        return null;
    }

    @Override
    public boolean updateTeam(Team team) throws SQLException {
        return false;
    }

    @Override
    public Team deleteTeam(int teamID) throws SQLException {
        return null;
    }
}
