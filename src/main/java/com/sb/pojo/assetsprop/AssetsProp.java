package com.sb.pojo.assetsprop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetsProp {

    /**
     * 编码
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private Integer prop;
}
