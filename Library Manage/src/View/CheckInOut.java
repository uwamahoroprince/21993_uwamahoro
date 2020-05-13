/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.operationcat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author prince
 */
public class CheckInOut {
    
    private LocalDateTime dateTime;
    private String status;
    private operationcat operationCategory;
    
    public CheckInOut() {
    }

    public CheckInOut(LocalDateTime dateTime, String status, operationcat operationCategory) {
        this.dateTime = dateTime;
        this.status = status;
        this.operationCategory = operationCategory;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public operationcat getOperationCategory() {
        return operationCategory;
    }

    public void setOperationCategory(operationcat operationCategory) {
        this.operationCategory = operationCategory;
    }

 
   
   
    
    
    
    
    
}
