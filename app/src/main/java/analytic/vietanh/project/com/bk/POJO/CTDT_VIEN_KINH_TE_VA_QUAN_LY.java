package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_KINH_TE_VA_QUAN_LY {
    final static String NAME_CLASS = "Viện Kinh Tế và Quản Lý";
    public static class CT_CU_NHAN_KINH_DOANH{
        final static String NAME_SUBCLASS = "Chương Trình Cử Nhân Kinh Doanh";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KINH_TE_NANG_LUONG{
        final static String NAME_SUBCLASS = "Cử Nhân Kinh Tế Năng Lượng";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return  NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_QUAN_LY_DOANH_NGHIEP{
        final static String NAME_SUBCLASS ="Cử Nhân Quản Lý Doanh Nghiệp";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return  NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_TAI_CHINH_NGAN_HANG{
        final static String NAME_SUBCLASS ="Cử Nhân Tài Chính Ngân Hàng";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return  NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KE_TOAN_KIEM_TOAN{
        final static String NAME_SUBCLASS =   "Cử Nhân Kế Toán Kiểm Toán";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static String getName(){
        return NAME_CLASS;
    }

    public static int checkSoTC(String nameClass, String nameSubClass){
        if(nameClass.equals(NAME_CLASS)){
            if(nameSubClass.equals(CT_CU_NHAN_KINH_DOANH.getTen()))
                return CT_CU_NHAN_KINH_DOANH.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KINH_TE_NANG_LUONG.getTen()))
                return CT_CU_NHAN_KINH_TE_NANG_LUONG.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_QUAN_LY_DOANH_NGHIEP.getTen()))
                return CT_CU_NHAN_QUAN_LY_DOANH_NGHIEP.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_TAI_CHINH_NGAN_HANG.getTen()))
                return CT_CU_NHAN_TAI_CHINH_NGAN_HANG.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KE_TOAN_KIEM_TOAN.getTen()))
                return CT_CU_NHAN_KE_TOAN_KIEM_TOAN.getSoTC();
            return -1;
        }else
            return -1;
    }

}
