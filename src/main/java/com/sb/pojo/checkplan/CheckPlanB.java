package com.sb.pojo.checkplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckPlanB {

    private Integer id;

    private Integer checkPlanId;

    /**
     * 是否审核
     */
    private Boolean check;

    /**
     * 动作
     */
    private Integer actionId;

    /**
     * 前置动作
     */
    private Integer beforeActionId;

    /**
     * 频率
     */
    private Integer frequency;

    /**
     * 单据类型
     */
    private Integer billTypeId;

}
