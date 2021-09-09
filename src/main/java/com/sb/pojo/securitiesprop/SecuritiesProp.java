package com.sb.pojo.securitiesprop;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecuritiesProp {

    private Integer id;

    private Integer securitiesId;

    private Date tradeDate;

    private Integer propertyId;

}
