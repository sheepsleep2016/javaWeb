import com.utils.JDBCUtils;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class JDBCUtilsTest {

    @org.junit.jupiter.api.Test
    void getConnection() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }

//    @org.junit.jupiter.api.Test
//    void releaseConenction() {
//        Connection connection = JDBCUtils.getConnection();
//        System.out.println(connection);
//        JDBCUtils. closeResource(connection);
//    }
}