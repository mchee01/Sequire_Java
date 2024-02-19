package com.koreait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.spi.DirStateFactory.Result;

import oracle.net.nt.ConnOption;

public class TblBuyDao {
    
    public static void main(String[] args) {
        Connection conn = null;
        String sql = "";
        try{
            conn = DriverManager.getConnection(url,user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }
        String sql = "select * from tbl_score";
         
        try {
            
            while (condition) {
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }
    
    
}
