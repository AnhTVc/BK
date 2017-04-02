package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_CONG_NGHE_THONG_TIN_VA_TRUYEN_THONG {
    final static String NAME_CLASS = "Viện Công Nghệ Thông Tin và Truyền Thông";

    public static class CT_CU_NHAN_NGHE_THONG_TIN_VA_TRUYEN_THONG{
        final static String NAME_SUBCLASS =  "CN Kỹ Thuật Công Nghê Thông Tin";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KHOA_HOC_MAY_TINH{
        final static String NAME_SUBCLASS = "KS Khoa Học Máy Tính";
        public static int getSoTC() {
            return 159;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_HE_THONG_THONG_TIN{
        final static String NAME_SUBCLASS = "KS Hệ Thống Thông Tin";
        public static int getSoTC() {
            return 158;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_PHAN_MEM{
        final static String NAME_SUBCLASS = "KS Kỹ Thuật Phầm Mềm";
        public static int getSoTC() {
            return 158;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KY_THUAT_MAY_TINH_VA_TRUYEN_THONG{
        final static String NAME_SUBCLASS = "KS Kỹ Thuật Máy Tính Và Truyền Thông";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_MAY_TINH{
        final static String NAME_SUBCLASS = "KS Kỹ Thuật Máy Tính";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_TRUYEN_THONG_VA_MANG_MAY_TINH{
        final static String NAME_SUBCLASS = "KS Truyền Thông Và Mạng Máy Tính";
        public static int getSoTC() {
            return 158;
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
            if(nameSubClass.equals(CT_CU_NHAN_NGHE_THONG_TIN_VA_TRUYEN_THONG.getTen()))
                return CT_CU_NHAN_NGHE_THONG_TIN_VA_TRUYEN_THONG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KHOA_HOC_MAY_TINH.getTen()))
                return CT_KY_SU_KHOA_HOC_MAY_TINH.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_HE_THONG_THONG_TIN.getTen()))
                return CT_KY_SU_HE_THONG_THONG_TIN.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_PHAN_MEM.getTen()))
                return CT_KY_SU_KY_THUAT_PHAN_MEM.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_MAY_TINH_VA_TRUYEN_THONG.getTen()))
                return CT_CU_NHAN_KY_THUAT_MAY_TINH_VA_TRUYEN_THONG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_MAY_TINH.getTen()))
                return CT_KY_SU_KY_THUAT_MAY_TINH.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_TRUYEN_THONG_VA_MANG_MAY_TINH.getTen()))
                return CT_KY_SU_TRUYEN_THONG_VA_MANG_MAY_TINH.getSoTC();
            return -1;
        }else
            return -1;
    }
}
