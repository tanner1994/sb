package com.sb.dao.actionlogb.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 动作执行日志子表
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("动作执行日志子表")
public class ActionLogB {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "主表主键", example = "1")
    private Integer actionLogId;

    @ApiModelProperty(value = "业务类别", example = "1")
    private Integer businessTypeId;

    @ApiModelProperty(value = "组织", example = "1")
    private Integer orgId;

    @ApiModelProperty(value = "动作", example = "1")
    private Integer actionId;

    @ApiModelProperty(value = "日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate;

}
