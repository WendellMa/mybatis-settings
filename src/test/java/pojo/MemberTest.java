package pojo;

import com.myq.mybatis.mapper.MemberMapper;
import com.myq.mybatis.pojo.Member;
import com.myq.mybatis.settings.SqlSessionFactoryEncode;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * created on 17/12/2
 *
 * @author romens
 * @version 1.0
 */
public class MemberTest {
    private Logger logger = Logger.getLogger(MemberTest.class);
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryEncode.getSqlSessionFactory();

//    @Test
//    public void getMemberById() {
//        SqlSession sqlSession = null;
//        try {
//            sqlSession = sqlSessionFactory.openSession();
//            MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
//            Member member = memberMapper.getMemberById("12580887071004328000");
//            logger.info(member.print());
//        } finally {
//            if (sqlSession != null) {
//                sqlSession.close();
//            }
//        }
//    }

    @Test
    public void getMemberByName() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
            RowBounds rowBounds = new RowBounds(0,20);
            List<Member> memberList = memberMapper.findMemberByName("王",rowBounds);
            for (Member member : memberList) {
                logger.info(member.print());
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
