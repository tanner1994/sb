package com.sb.dao.securities.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 证券档案
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("证券档案")
public class Securities {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "助记码")
    private String helpCode;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "交易所", example = "1")
    private Integer bourseId;

    @ApiModelProperty(value = "证券分类", example = "1")
    private Integer sclassifyId;

    @ApiModelProperty(value = "行权日")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date exerciseDate;

    @ApiModelProperty(value = "行权价", example = "1")
    private BigDecimal exercisePrice;

    @ApiModelProperty(value = "是否计提利息")
    private Boolean ifAccrual;

    @ApiModelProperty(value = "是否计提公允")
    private Boolean ifFairdistill;

    @ApiModelProperty(value = "是否计提万份收益")
    private Boolean ifWfsy;

}
