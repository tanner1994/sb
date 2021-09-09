package com.sb.pojo.securities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecuritiesB {

    private Integer id;
    private Integer securitiesId;
    private Date tradeDate;
    private Double passNum;
    private Double capital;

}
