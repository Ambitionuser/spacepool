package com.it.cloud.config.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.it.cloud.dao.teacher", sqlSessionFactoryRef = "teacherSqlSessionFactory")
public class TeacherSource {

    /**
     * 创建数据源
     */
    @Bean(name = "teacherDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.teacher")
    public DataSource teacherDataSource() {
        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
    }

    /**
     * 创建工厂
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "teacherSqlSessionFactory")
    public SqlSessionFactory teacherSqlSessionFactory(@Qualifier("teacherDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //读取mybatis配置文件
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/teacher/*.xml"));
        return bean.getObject();
    }

    /**
     * 创建事务
     * @param dataSource
     * @return
     */
    @Bean(name = "teacherTransactionManager")
    public DataSourceTransactionManager teacherTransactionManager(@Qualifier("teacherDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * 创建模板
     * @param sqlSessionFactory
     * @return
     * @throws Exception
     */
    @Bean(name = "teacherSqlSessionTemplate")
    public SqlSessionTemplate teachertSqlSessionTemplate(@Qualifier("teacherSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
