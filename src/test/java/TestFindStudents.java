import com.cache.Application;
import com.cache.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class TestFindStudents {

    @Test
    public void test1() throws SQLException, ClassNotFoundException {
        /*List<Student> studnts = StudentsFunctions.findStudnts();
        studnts.forEach(stu -> System.out.println(stu));*/
    }
}
