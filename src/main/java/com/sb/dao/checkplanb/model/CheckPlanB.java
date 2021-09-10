package com.sb.dao.checkplanb.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 审核方案B表
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("审核方案B表")
public class CheckPlanB {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "主表主键", example = "1")
    private Integer checkPlanId;

    @ApiModelProperty(value = "是否审核")
    private Boolean isCheck;

    @ApiModelProperty(value = "动作", example = "1")
    private Integer actionId;

    @ApiModelProperty(value = "前置动作", example = "1")
    private Integer beforeActionId;

    @ApiModelProperty(value = "频率", example = "1")
    private Integer frequency;

    @ApiModelProperty(value = "单据类型", example = "1")
    private Integer billTypeId;

}
