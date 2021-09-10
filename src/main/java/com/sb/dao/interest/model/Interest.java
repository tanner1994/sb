package com.sb.dao.interest.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 利率信息
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("利率信息")
public class Interest {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "债券还本付息方式", example = "1")
    private Integer bondPayTypeId;

    @ApiModelProperty(value = "债券付息周期", example = "1")
    private Integer bondPeriodTypeId;

    @ApiModelProperty(value = "债券收益方式", example = "1")
    private Integer bondProfitTypeId;

    @ApiModelProperty(value = "利率类型", example = "1")
    private Integer rateTypeId;

    @ApiModelProperty(value = "起息日")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @ApiModelProperty(value = "到期日")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    @ApiModelProperty(value = "计息总期数", example = "1")
    private Integer periodSum;

    @ApiModelProperty(value = "票面利率%", example = "1")
    private BigDecimal yearRate;

    @ApiModelProperty(value = "证券档案", example = "1")
    private Integer securitiesId;

    @ApiModelProperty(value = "发行日", example = "1")
    private BigDecimal issuePrice;

    @ApiModelProperty(value = "面值", example = "1")
    private BigDecimal parValue;

    @ApiModelProperty(value = "计息天数", example = "1")
    private Integer daysPerYear;

    @ApiModelProperty(value = "是否自动生成行情")
    private Boolean isGen;

}
