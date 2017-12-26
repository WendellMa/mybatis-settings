package pojo;

import com.myq.mybatis.mapper.MaleHealthFormMapper;
import com.myq.mybatis.pojo.MaleHealthForm;
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
public class MaleHealthFormTest {
    private Logger logger = Logger.getLogger(MaleHealthFormTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

    @Test
    public void getMaleHealthForm() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            MaleHealthFormMapper maleHealthFormMapper = sqlSession.getMapper(MaleHealthFormMapper.class);
            MaleHealthForm maleHealthForm = maleHealthFormMapper.getMaleHealthForm(2l);
            logger.info(maleHealthForm.getId());
            logger.info(maleHealthForm.getProstate());
            logger.info(maleHealthForm.getHeart());
            logger.info(maleHealthForm.getLiver());
            logger.info(maleHealthForm.getLung());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
