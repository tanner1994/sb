package com.sb.dao.capital.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 股本
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("股本")
public class Capital {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "证券档案", example = "1")
    private Integer securitiesId;

    @ApiModelProperty(value = "交易日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate;

    @ApiModelProperty(value = "流通盘", example = "1")
    private BigDecimal passNum;

    @ApiModelProperty(value = "总股本", example = "1")
    private BigDecimal capital;

}
