package Operaciones;

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
}
