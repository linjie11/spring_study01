package com.linjie.factory;

import com.linjie.bean.Book;
import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;

/**
 * 实现了FactoryBean接口的类是spring可以认识的工厂类；
 * spring会自动的调用工厂方法创建实例
 */
public class MyFactoryBeanImple implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBookname(UUID.randomUUID().toString());
        return book;
    }

    /**
     * 返回创建对象的类型
     * Spring会自动调用这个方法来确认创建的对象是什么类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }

    /**
     * 是单例？
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
