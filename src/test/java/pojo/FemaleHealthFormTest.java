package pojo;

import com.myq.mybatis.mapper.FemaleHealthFormMapper;
import com.myq.mybatis.pojo.FemaleHealthForm;
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
public class FemaleHealthFormTest {
    private Logger logger = Logger.getLogger(MaleHealthFormTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

    @Test
    public void getEmployeeTaskByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            FemaleHealthFormMapper femaleHealthFormMapper = sqlSession.getMapper(FemaleHealthFormMapper.class);
            FemaleHealthForm femaleHealthForm = femaleHealthFormMapper.getFemaleHealthForm(1l);
            logger.info(femaleHealthForm.getId());
            logger.info(femaleHealthForm.getUterus());
            logger.info(femaleHealthForm.getHeart());
            logger.info(femaleHealthForm.getLiver());
            logger.info(femaleHealthForm.getLung());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
