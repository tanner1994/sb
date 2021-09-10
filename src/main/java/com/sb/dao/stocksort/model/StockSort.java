package com.sb.dao.stocksort.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 库存组织
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Data
@ApiModel("库存组织")
public class StockSort {

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "是否调平")
    private Boolean isTp;

}
