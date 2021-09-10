package com.sb.dao.trademarket.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 行情
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("行情")
public class TradeMarket {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "证券档案", example = "1")
    private Integer securitiesId;

    @ApiModelProperty(value = "交易日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate;

    @ApiModelProperty(value = "开盘价")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date openPrice;

    @ApiModelProperty(value = "收盘价", example = "1")
    private BigDecimal closePrice;

    @ApiModelProperty(value = "最低价", example = "1")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "最高价", example = "1")
    private BigDecimal maxPrice;

    @ApiModelProperty(value = "均价", example = "1")
    private BigDecimal averagePrice;

    @ApiModelProperty(value = "全价", example = "1")
    private BigDecimal qRice;

    @ApiModelProperty(value = "净价", example = "1")
    private BigDecimal jRice;

    @ApiModelProperty(value = "应计利息", example = "1")
    private BigDecimal yjlx;

    @ApiModelProperty(value = "万份收益", example = "1")
    private BigDecimal wfsy;

    @ApiModelProperty(value = "日间利息", example = "1")
    private BigDecimal rjlx;

}
