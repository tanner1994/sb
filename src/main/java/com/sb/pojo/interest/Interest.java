package com.sb.pojo.interest;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interest {

    private Integer id;

    private Integer bondPayTypeId;

    private Integer bondPeriodTypeId;

    private Integer bondProfitTypeId;

    private Integer rateTypeId;

    private Date startDate;

    private Date endDate;

    private Integer periodSum;

    private Double yearRate;

    private Integer securitiesId;

    private Double issuePrice;// 发行价

    private Double parValue;// 面值

    private Integer daysPerYear;// 年计息天数

    private Boolean gen = Boolean.FALSE;// 是否生成计息行情

}
