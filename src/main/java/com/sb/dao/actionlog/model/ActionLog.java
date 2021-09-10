package com.sb.dao.actionlog.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 动作执行日志
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("动作执行日志")
public class ActionLog {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "业务类别", example = "1")
    private Integer businessTypeId;

    @ApiModelProperty(value = "组织", example = "1")
    private Integer orgId;

    @ApiModelProperty(value = "日期1")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate1;

    @ApiModelProperty(value = "日期2")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate2;

    @ApiModelProperty(value = "日期3")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate3;

    @ApiModelProperty(value = "日期4")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate4;

    @ApiModelProperty(value = "日期5")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate5;

    @ApiModelProperty(value = "日期6")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate6;

    @ApiModelProperty(value = "日期7")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate7;

    @ApiModelProperty(value = "日期8")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate8;

    @ApiModelProperty(value = "日期9")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate9;

}
