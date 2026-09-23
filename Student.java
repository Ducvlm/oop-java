public class Student {
    private String mssv;
    private String name;
    private float diemCC;
    private float diemGK;
    private float diemCK;
    public Student(String mssv, String name, float diemCC, float diemGK, float diemCK) {
        this.mssv = mssv;
        this.name = name;
        this.diemCC = diemCC;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
    }
    public String getMssv() {
        return mssv;
    }
    public String getName() {
        return name;
    }
    public float getDiemCC() {
        return diemCC;
    }
    public float getDiemGK() {
        return diemGK;
    }
    public float getDiemCK() {
        return diemCK;
    }
    public double getDiemTB() {
        return (diemCC*0.1 + diemGK*0.3 + diemCK*0.6);
    }
    public void setDiemCC(float diemCC) {
        if (diemCC>0 && diemCC<=10) {
            this.diemCC = diemCC;
        } else {
            System.out.println("Diem khong hop le");
        }
    }
    public void setDiemGK(float diemGK) {
        if (diemGK>0 && diemGK<=10) {
            this.diemGK = diemGK;
        } else {
            System.out.println("Diem khong hop le");
        }
    }
    public void setDiemCK(float diemCK) {
        if (diemCK>0 && diemCK<=10) {
            this.diemCK = diemCK;
        } else {
            System.out.println("Diem khong hop le");
        }
    }
    public String toString() {
        return mssv + " " + name + " " + getDiemTB();
    }
    public static void main(String[] args){
        Student sv1 = new Student ("B20DCCN001", "Nguyen Van A", 8, 7, 9);
        Student sv2 = new Student ("B20DCCN002", "Tran Thi B", 6, 5, 7);
        Student sv3 = new Student ("B20DCCN003", "Le Van C", 9, 8, 10);
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        sv1.setDiemCC(-1);
    }
}