package pojo;

import com.myq.mybatis.mapper.TaskMapper;
import com.myq.mybatis.mapper.WorkCardMapper;
import com.myq.mybatis.pojo.Task;
import com.myq.mybatis.pojo.WorkCard;
import com.myq.mybatis.settings.SqlSessionFactoryEncode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 工牌
 *
 * @author romens
 * @version 1.0
 */
public class WorkCardTest {
    private Logger logger = Logger.getLogger(TaskTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

    @Test
    public void getWorkCardByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            WorkCardMapper workCardMapper = sqlSession.getMapper(WorkCardMapper.class);
            WorkCard workCard = workCardMapper.getWorkCardByEmpId(1l);
            logger.info(workCard.getId());
            logger.info(workCard.getEmpId());
            logger.info(workCard.getDepartment());
            logger.info(workCard.getMobile());
            logger.info(workCard.getRealName());
            logger.info(workCard.getVocation());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
