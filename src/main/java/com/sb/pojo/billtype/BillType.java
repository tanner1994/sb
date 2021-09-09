package com.sb.pojo.billtype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillType {

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
     * 类名
     */
    private String className;

    /**
     * 影响库存1
     */
    private Integer stockSort1Id;

    /**
     * 影响库存2
     */
    private Integer stockSort2Id;

    /**
     * 节点号
     */
    private String funCode;

    /**
     * 业务分类
     */
    private Integer businessTypeId;

    /**
     * 资金方向
     */
    private Integer direction;

}
