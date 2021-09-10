package com.sb.dao.tally.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 记账
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("记账")
public class Tally {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "记账日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tallyDate;

    @ApiModelProperty(value = "组织", example = "1")
    private Integer orgId;

    @ApiModelProperty(value = "备注")
    private String remark;

}
