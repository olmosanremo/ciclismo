package bizPackage;

import java.sql.SQLException;
import connectionPackage.DBConnection;

public class BizLogic {
    public BizLogic() throws SQLException {
    }

    protected void testTheScreen (){
        System.out.println("Hallo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    DBConnection dbConnection = DBConnection.getInstance();
}
