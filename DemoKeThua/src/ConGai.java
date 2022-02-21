public class ConGai extends Cha {
    //Ghi đè:
    @Override
    //Lớp con triển khai lại phương thức ở lớp cha
    //Phương thức giống y hệt phương thức lớp cha
    //(Kiểu dữ liệu trả về, tên phương thức, danh sách tham số)
    //Mức độ truy cập phải bằng hoặc cao hơn
    String hat() {
        return "Em dang hat";
    }

    //Nạp chồng:
    //Là tên phương thức giống phương thức đã có
    void hat(String text){
        System.out.println(text);
    }

    void mua(){

    }
}
