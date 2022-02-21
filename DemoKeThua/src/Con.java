public class Con extends Cha{
    String email;

    public Con(String email) {
        //mặc định gọi đến contructor không tham số thuộc lớp Cha
        //gọi super trước this
        super("Mau den", "Mau vang");
        this.email = email;
        System.out.println("Hàm khởi tạo thuộc lớp con");
    }

    public Con(String mauMat, String mauDa, String email) {
        super(mauMat, mauDa);
        this.email = email;
    }

    void choiLoDe(){

    }
}
