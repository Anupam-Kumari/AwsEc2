import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.rds.aws.lambda.requests.Course;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Handler implements RequestHandler<Course, Boolean> {

    private Logger logger = Logger.getLogger(Handler.class.getName());

    static Connection connection;
    static {
        try {

            String Student Id = System.getenv("Student Id");
            String First Name = System.getenv("First Name");
			String Last Name = System.getenv("Last Name");
			String Current Job = System.getenv("Current Job");
			String Location = System.getenv("Location");

            String URL = System.getenv("dbURL");

            connection = DriverManager.getConnection(URL, Student Id, First Name, Last Name,Current Job,Location);

        } catch (SQLException e) {

        }
    }

    @Override
    public Boolean handleRequest(Course input, Context context) {
        try {

            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO mylambdadb.course (name,code) values('" + input.getName() + "','"
                    + input.getCode() + "')");

            return true;
        } catch (Exception e) {
            logger.info(e.getLocalizedMessage());
        }
        return false;
    }
}