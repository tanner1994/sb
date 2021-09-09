package com.sb.pojo.trademarket;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeMarket {

    private Integer id;

    private Integer securitiesId;

    private Date tradeDate;

    private Double openPrice;

    private Double closePrice;

    private Double minPrice;

    private Double maxPrice;

    private Double averagePrice;

    private Double qPrice;// 全价

    private Double jPrice;// 净价

    private Double yjlx;// 应计利息

    private Double wfsy;// 万分收益

    private Double rjlx;// 日间利息

}
