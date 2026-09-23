public class Student2 {
    private static int counter = 0;
    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;
    private String email;
    private String sdt;
    public Student2 (String name, double diemCC, double diemGK, double diemCK) {
        counter++;
        this.mssv = String.format("B21DCCN%03d", counter); 
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }
    public static int getTotalStudents() {
        return counter;
    }
    public Student2 capNhatEmail(String email) {
        this.email = email;
        return this;
    }
    public Student2 capNhatSdt(String sdt) {
        this.sdt = sdt;
        return this;
    }
    public String getMssv() {
        return mssv;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getSdt() {
        return sdt;
    }
    public double getDiemCC() {
        return diemCC;
    }
    public double getDiemGK() {
        return diemGK;
    }
    public double getDiemCK() {
        return diemCK;
    }
    public void setDiemCC(double diemCC) {
        if (diemCC >= 0 && diemCC <= 10) {
            this.diemCC = diemCC;
        } else {
            System.out.println("Điểm chuyên cần không hợp lệ!");
        }
    }
    public void setDiemGK(double diemGK) {
        if (diemGK >= 0 && diemGK <= 10) {
            this.diemGK = diemGK;
        } else {
            System.out.println("Điểm giữa kỳ không hợp lệ!");
        }
    }
    public void setDiemCK(double diemCK) {
        if (diemCK >= 0 && diemCK <= 10) {
            this.diemCK = diemCK;
        } else {
            System.out.println("Điểm cuối kỳ không hợp lệ!");
        }
    }
    public static void main(String[] args) {
        Student2 sv1 = new Student2("Lan", 8, 7.5, 9);
        sv1.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");
        Student2 sv2 = new Student2("Minh", 7, 8.0, 8.5);
        Student2 sv3 = new Student2("Hoa", 9, 6.5, 7.0);
        sv2.capNhatEmail("minh@ptit.edu.vn").capNhatSdt("0923456789");
        sv3.capNhatEmail("hoa@ptit.edu.vn").capNhatSdt("0934567890");
        System.out.println("MSSV sv1: " + sv1.getMssv()); 
        System.out.println("MSSV sv2: " + sv2.getMssv());
        System.out.println("MSSV sv3: " + sv3.getMssv()); 
        System.out.println("Email sv2: " + sv2.getEmail());
        System.out.println("SĐT sv2: " + sv2.getSdt());
        System.out.println("Email sv3: " + sv3.getEmail());
        System.out.println("SĐT sv3: " + sv3.getSdt());
        System.out.println("tong so sinh vien da tao: " + Student2.getTotalStudents());    
    }
}