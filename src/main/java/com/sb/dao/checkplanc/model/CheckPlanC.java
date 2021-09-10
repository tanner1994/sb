package com.sb.dao.checkplanc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 审核方案C表
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("审核方案C表")
public class CheckPlanC {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "主表主键", example = "1")
    private Integer checkPlanId;

    @ApiModelProperty(value = "单据类型", example = "1")
    private Integer billTypeId;

    @ApiModelProperty(value = "是否审核")
    private Boolean isCheck;

    @ApiModelProperty(value = "审核顺序", example = "1")
    private Integer checkOrder;

}
