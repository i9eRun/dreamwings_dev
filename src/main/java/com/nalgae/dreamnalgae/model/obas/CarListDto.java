package com.nalgae.dreamnalgae.model.obas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarListDto {
    private String centerCd;
    private String carCd;
    private String carRegnum;
    private String repairDriver;
    private String carNm;
    
}
