package com.sb.pojo.sclassify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sclassify {

    private Integer id;

    private String code;

    private String name;

    private Integer parentId;

}
