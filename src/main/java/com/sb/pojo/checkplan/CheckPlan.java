package com.sb.pojo.checkplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckPlan {

    private Integer id;

    /**
     * 组织
     */
    private Integer orgId;

    /**
     * 业务类型
     */
    private Integer businessTypeId;

}
