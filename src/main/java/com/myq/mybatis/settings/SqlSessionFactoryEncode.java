package com.myq.mybatis.settings;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 解密用户和密码后创建SqlSessionFactory
 *
 * @author romens
 * @version 1.0
 */
public class SqlSessionFactoryEncode {
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory;
        String resource = "mybatis-config.xml";
        String jdbcResource = "jdbc.properties";
        InputStream inputStream;
        InputStream in;
        try {
            in = Resources.getResourceAsStream(jdbcResource);
            Properties properties = new Properties();
            properties.load(in);
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            properties.put("database.username", CodeUtils.decode(username));
            properties.put("database.password", CodeUtils.decode(password));
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, properties);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return sqlSessionFactory;
    }

    public static void main(String[]args){
        getSqlSessionFactory();
        System.out.println("success");
    }
}
