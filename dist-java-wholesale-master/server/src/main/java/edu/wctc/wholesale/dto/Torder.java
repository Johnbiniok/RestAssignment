package edu.wctc.wholesale.dto;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Torder {
    private Customer customerName;
    private Date date;
    private int poNumber;
    private Product productName;
    private String terms;
    private Date shipped;
    private double total;

   // private Date purchaseDate;

}
