import Util.ConnectionUtil;
import Util.FileUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class Lab4Test {
    public double getResult(String file) {
        String sql = FileUtil.parseSQLFile("src/main/"+file);
        if(sql.length()<3){
            Assert.fail("No SQL statement written in "+file);
        }
        double value = 0.0;
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            ResultSet rs =s.executeQuery(sql);

            if(rs.next()) {
                value = rs.getDouble(1);
            }
        } catch (SQLException e) {
            Assert.fail("Issue with sql statement: "+e.getMessage());
        }
        return value;
    }

    @Test
    public void testActivityFindMaxSalary() {
        Double expected = 99890.99;
        Double result = getResult("lab4.sql");

        Assert.assertEquals(expected, result);
    }
    @Before
    public void beforeEach() {
        try {
            Connection conn = ConnectionUtil.getConnection();

            String createTable = "CREATE TABLE employee (" +
                    "id SERIAL PRIMARY KEY," +
                    "first_name VARCHAR(255)," +
                    "last_name VARCHAR(255)," +
                    "salary DOUBLE PRECISION" +
                    ");";
            PreparedStatement createTableStatement = conn.prepareStatement(createTable);
            createTableStatement.executeUpdate();

            String insertData = "INSERT INTO employee (first_name, last_name, salary) VALUES" +
                    "('Steve', 'Garcia', 67400.00)," +
                    "('Alexa', 'Smith', 42500.00)," +
                    "('Steve', 'Jones', 99890.99)," +
                    "('Brandon', 'Smith', 120000)," +
                    "('Adam', 'Jones', 55050.50);";
            PreparedStatement insertDataStatement = conn.prepareStatement(insertData);
            insertDataStatement.executeUpdate();

        } catch(SQLException e) {
        }
    }

    @After
    public void afterEach() {
        try {
            Connection conn = ConnectionUtil.getConnection();

            String dropTable = "DROP TABLE IF EXISTS employee";
            PreparedStatement createTableStatement = conn.prepareStatement(dropTable);
            createTableStatement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
