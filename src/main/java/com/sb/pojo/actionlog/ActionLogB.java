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

    private Integer actionLogId;

    private Integer businessTypeId;

    private Integer orgId;

    private Integer actionId;

    private Date tradeDate;

}
