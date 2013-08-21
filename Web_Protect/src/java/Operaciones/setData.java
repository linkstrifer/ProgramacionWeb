package Operaciones;

import java.sql.*;

public class setData {
    private String id;
    private String names;
    private String address;
    private String phone;
    private String cellphone;
    
    public setData( String id, String names, String address, String phone, String cellphone)
    {
        this.id = id.trim();
        this.names = names.toLowerCase();
        this.address = address.toLowerCase();
        this.phone = phone.trim();
        this.cellphone = cellphone.trim();
    }
    
    public static synchronized boolean set( setData data ) throws SQLException
    {
        dbManager dbManager = new dbManager();
        Connection connection = dbManager.getConnection();
        
        PreparedStatement sql = connection.prepareStatement("INSERT INTO schedule(id,inames,address,phone,cellphone) VALUES (?,?,?,?,?)");
        
        sql.setString(1, data.getId() );
        sql.setString(2, data.getNames() );
        sql.setString(3, data.getAddress() );
        sql.setString(4, data.getPhone() );
        sql.setString(5, data.getCellphone() );
        
        int res = sql.executeUpdate();
        sql.close();
        dbManager.closeConnection( connection );
        return res==1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
