package com.grupoG33.reto3.dbo;


import com.grupoG33.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReportClientDbo {
    public Integer total;
    public ClientModel client;
}
