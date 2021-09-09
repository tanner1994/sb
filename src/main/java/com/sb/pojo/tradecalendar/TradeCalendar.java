package com.sb.pojo.tradecalendar;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeCalendar {

    private Integer id;

    private Date tradeDate;

    private Boolean istrade;

}
