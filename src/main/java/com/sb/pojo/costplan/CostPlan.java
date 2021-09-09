package com.sb.pojo.costplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostPlan {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 方案类型
     */
    private Integer costType;

    /**
     * 公司维度
     */
    private Boolean useOrg;

    /**
     * 业务小组维度
     */
    private Boolean ifSelfsGroup;

    /**
     * 资金账号维度
     */
    private Boolean ifCapAccount;

    /**
     * 股东账号维度
     */
    private Boolean ifPartnAccount;

    /**
     * 组织
     */
    private Integer orgId;

}
