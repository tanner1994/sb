package com.sb.dao.checkplan.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 审核方案主表
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("审核方案主表")
public class CheckPlan {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "组织", example = "1")
    private Integer orgId;

    @ApiModelProperty(value = "业务类别", example = "1")
    private Integer businessTypeId;

}
