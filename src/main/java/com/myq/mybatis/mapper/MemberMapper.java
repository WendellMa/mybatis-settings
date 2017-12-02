package com.myq.mybatis.mapper;

import com.myq.mybatis.pojo.Member;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * created on 17/12/2
 *
 * @author romens
 * @version 1.0
 */
public interface MemberMapper {
    public Member getMemberById(@Param("memberId") String memberId);

    public List<Member> findMemberByName(@Param("nickName") String nickName, RowBounds rowBounds);
}
