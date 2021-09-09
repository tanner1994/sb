package com.sb.pojo.selfsgroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelfsGroup {

    private Integer id;

    private String code;

    private String name;

    private Integer parentId;

    private Integer orgId;

}
