package com.youran.generate.pojo.qo;

import com.youran.common.pojo.qo.AbstractQO;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;

import static com.youran.generate.pojo.example.MetaCascadeExtExample.E_FIELDID;
import static com.youran.generate.pojo.example.MetaCascadeExtExample.N_FIELDID;

/**
 * Title: 查询参数
 * Description:
 * Author: cbb
 * Create Time:2017/6/14 9:32
 */
public class MetaCascadeExtQO extends AbstractQO {

    @ApiParam(value = N_FIELDID, example = E_FIELDID)
    @NotNull
    private Integer fieldId;

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }
}
