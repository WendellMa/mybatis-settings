package pojo;

import com.myq.mybatis.mapper.EmployeeTaskMapper;
import com.myq.mybatis.mapper.TaskMapper;
import com.myq.mybatis.pojo.EmployeeTask;
import com.myq.mybatis.pojo.Task;
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
public class TaskTest {
    private Logger logger = Logger.getLogger(TaskTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

    @Test
    public void getEmployeeTaskByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            TaskMapper memberMapper = sqlSession.getMapper(TaskMapper.class);
            Task task = memberMapper.getTask(1l);
            logger.info(task.getTitle());
            logger.info(task.getContent());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
