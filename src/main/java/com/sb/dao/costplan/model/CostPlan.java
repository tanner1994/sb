package com.sb.dao.costplan.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 成本核算方案
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("成本核算方案")
public class CostPlan {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "方案类型", example = "1")
    private Integer costType;

    @ApiModelProperty(value = "是否使用公司维度")
    private Boolean isOrg;

    @ApiModelProperty(value = "是否使用资金账号维度")
    private Boolean isCapAccount;

    @ApiModelProperty(value = "是否使用业务小组为度")
    private Boolean isSelfsGroup;

    @ApiModelProperty(value = "是否使用股东账号维度")
    private Boolean isPartnAccount;

    @ApiModelProperty(value = "组织", example = "1")
    private Integer orgId;

}
