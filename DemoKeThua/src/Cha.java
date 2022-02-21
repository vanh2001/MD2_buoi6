public class Cha {
    String mauMat;
    String mauDa;

    public Cha() {
        System.out.println("Hàm khởi tạo thuộc lớp cha");
    }

    public Cha(String mauMat, String mauDa) {
        this.mauMat = mauMat;
        this.mauDa = mauDa;
    }

    @Override
    public String toString() {
        return "Cha{" +
                "mauMat='" + mauMat + '\'' +
                ", mauDa='" + mauDa + '\'' +
                '}';
    }

    String hat(){
        return "Tao dang hat";
    }
}
