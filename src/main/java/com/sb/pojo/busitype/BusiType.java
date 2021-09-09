package com.sb.pojo.busitype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusiType {

    private Integer id;

    private String code;

    private String name;

    private String parentId;

}
