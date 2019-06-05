package com.youran.generate.dao;

import com.youran.common.dao.DAO;
import com.youran.generate.pojo.po.MetaCascadeExtPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>Title:【级联扩展】数据库操作</p>
 * <p>Description:</p>
 * @author: cbb
 * @date: 2017/5/12
 */
@Repository
@Mapper
public interface MetaCascadeExtDAO extends DAO<MetaCascadeExtPO> {

    /**
     * 根据字段id查询【级联扩展】
     * @param fieldId
     * @return
     */
    List<MetaCascadeExtPO> findByFieldId(Integer fieldId) ;

}
