package pojo;

import com.myq.mybatis.mapper.EmployeeMapper;
import com.myq.mybatis.mapper.TaskMapper;
import com.myq.mybatis.pojo.Employee;
import com.myq.mybatis.pojo.Task;
import com.myq.mybatis.settings.SqlSessionFactoryEncode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * created on 17/12/26
 *
 * @author romens
 * @version 1.0
 */
public class EmployeeTest {
    private Logger logger = Logger.getLogger(EmployeeTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

    @Test
    public void getEmployeeTaskByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1l);
            logger.info(employee.getId());
            logger.info(employee.getRealName());
            logger.info(employee.getMobile());
            logger.info(employee.getSex().getName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
