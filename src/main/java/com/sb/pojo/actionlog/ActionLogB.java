package com.sb.pojo.actionlog;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionLogB {

    private Integer id;

    private String actionLogId;

    private String businessTypeId;

    private String orgId;

    private String actionId;

    private Date tradeDate;

}
