package com.imooc.extra.service;

import com.imooc.extra.exception.CustomException;

/**
 * <h1>Spring Transactional 测试接口定义</h1>
 * 
 */
public interface ISpringTransaction {

    /**
     * 主动捕获了异常, 导致事务不能回滚
     * */
    void CatchExceptionCanNotRollback();

    /**
     * 不是 unchecked 异常, 导致事务不能回滚
     * */
    void NotRuntimeExceptionCanNotRollback() throws CustomException;

    /**
     * unchecked 异常, 事务可以回滚
     * */
    void RuntimeExceptionCanRollback();

    /**
     * 指定了 rollbackFor, 事务可以回滚
     * */
    void AssignExceptionCanRollback() throws CustomException;

    /**
     * Rollback Only, 事务可以回滚
     * */
    void RollbackOnlyCanRollback() throws Exception;

    /**
     * 同一个类中, 一个不标注事务的方法去调用 transactional 的方法, 事务会失效
     * */
    void NonTransactionalCanNotRollback();
}
