package com.it.service;

import com.it.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */

    boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */

    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getAll();
}
