package com.sb.pojo.securities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Securities {

    private Integer id;
    private String code;
    private String helpCode;
    private String name;
    private Integer bourseId;
    private Integer sclassifyId;
    private Date exerciseDate;
    private Double exercisePrice;
    private Double ifAccrual;
    private Double ifFairdistill;
    private Double ifWfsy;
    private Double ifSynchronize;

}
