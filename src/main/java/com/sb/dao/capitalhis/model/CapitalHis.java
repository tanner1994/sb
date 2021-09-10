package com.sb.dao.capitalhis.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 证券历史属性
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("证券历史属性")
public class CapitalHis {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "证券档案", example = "1")
    private Integer securitiesId;

    @ApiModelProperty(value = "交易日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tradeDate;

    @ApiModelProperty(value = "证券属性", example = "1")
    private Integer propertyId;

}
