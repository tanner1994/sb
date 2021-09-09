package com.sb.pojo.tally;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tally {

    private Integer id;

    private String code;

    private String name;

    private Date tallyDate;// 期初记账日期

    private Integer orgId;

    private String remark;

}
