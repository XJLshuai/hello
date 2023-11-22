package com.it.dao;

import com.it.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
// TODO 添加Mapper
@Mapper
public interface BookDao {

    @Insert("insert into ssm_db.tbl_book values (null,#{type},#{name},#{description})")
    void save(Book book);
    @Update("update ssm_db.tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    void update(Book book);
    @Delete("delete from ssm_db.tbl_book where id=#{id}")
    void delete(Integer id);
    @Select("select * from ssm_db.tbl_book where id =#{id}")
    Book getById(Integer id);
    @Select("select * from ssm_db.tbl_book")
    List<Book> getAll();
}
