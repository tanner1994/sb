package com.sb.pojo.bourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bourse {

    private Integer id;

    private String code;

    private String name;

    private String shortName;

    private String parentId;

}
