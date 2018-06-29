package com.youran.generate.pojo.qo;

import com.youran.common.pojo.qo.AbstractQO;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;

import static com.youran.generate.pojo.example.MetaIndexExample.E_ENTITYID;
import static com.youran.generate.pojo.example.MetaIndexExample.N_ENTITYID;


/**
 * Title: 查询参数
 * Description:
 * Author: cbb
 * Create Time:2017/5/12 18:32
 */
public class MetaIndexQO extends AbstractQO {

    @ApiParam(value = N_ENTITYID, example = E_ENTITYID)
    @NotNull
    private Integer entityId;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }
}
