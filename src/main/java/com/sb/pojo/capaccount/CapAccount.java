package com.sb.pojo.capaccount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapAccount {

    private Integer id;

    private String code;

    private String name;

    private Integer parentId;

    private Integer orgId;

}
