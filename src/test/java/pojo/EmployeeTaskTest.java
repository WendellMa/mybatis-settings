package pojo;

import com.myq.mybatis.mapper.EmployeeTaskMapper;
import com.myq.mybatis.pojo.EmployeeTask;
import com.myq.mybatis.settings.SqlSessionFactoryEncode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * created on 17/12/26
 *
 * @author romens
 * @version 1.0
 */
public class EmployeeTaskTest {
    private Logger logger = Logger.getLogger(EmployeeTaskTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

    @Test
    public void getEmployeeTaskByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            EmployeeTaskMapper memberMapper = sqlSession.getMapper(EmployeeTaskMapper.class);
            List<EmployeeTask> employeeTaskList = memberMapper.getEmployeeTaskByEmpId(1l);
            for (EmployeeTask employeeTask : employeeTaskList) {
                logger.info(employeeTask.toString());
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
