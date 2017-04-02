package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_SU_PHAM_KY_THUAT {
    final static String NAME_CLASS = "Viện Sư Phạm Kỹ Thuật";
    public static class CT_CU_NHAN_SU_PHAM_KY_THUAT_DIEN{
        final static String NAME_SUBCLASS = "CN Sư Phạm Kỹ Thuật Điện";
        public static int getSoTC() {
            return 139;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_SU_PHAM_KY_THUAT_DIEN_TU_VIEN_THONG{
        final static String NAME_SUBCLASS = "CN Sư Phạm Kỹ Thuật Điện Tử Viễn Thông";
        public static int getSoTC() {
            return 145;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_SU_PHAM_KY_THUAT_CO_KHI_DONG_LUC{
        final static String NAME_SUBCLASS = "CN Sư Phạm Kỹ Thuật Cơ Khí Động Lực";
        public static int getSoTC() {
            return 143;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_SU_PHAM_CO_KHI_CHE_TAO_MAY{
        final static String NAME_SUBCLASS = "CN Sư Phạm Cơ Khí Chế Tạo";
        public static int getSoTC() {
            return 151;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_SU_PHAM_CONG_NGHE_THONG_TIN{
        final static String NAME_SUBCLASS =  "CN Sư Phạm Công Nghệ Thông Tin";
        public static int getSoTC() {
            return 136;
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
            if(nameSubClass.equals(CT_CU_NHAN_SU_PHAM_KY_THUAT_DIEN.getTen()))
                return CT_CU_NHAN_SU_PHAM_KY_THUAT_DIEN.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_SU_PHAM_KY_THUAT_DIEN_TU_VIEN_THONG.getTen()))
                return CT_CU_NHAN_SU_PHAM_KY_THUAT_DIEN_TU_VIEN_THONG.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_SU_PHAM_KY_THUAT_CO_KHI_DONG_LUC.getTen()))
                return CT_CU_NHAN_SU_PHAM_KY_THUAT_CO_KHI_DONG_LUC.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_SU_PHAM_CO_KHI_CHE_TAO_MAY.getTen()))
                return CT_CU_NHAN_SU_PHAM_CO_KHI_CHE_TAO_MAY.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_SU_PHAM_CONG_NGHE_THONG_TIN.getTen()))
                return CT_CU_NHAN_SU_PHAM_CONG_NGHE_THONG_TIN.getSoTC();
            return -1;
        }else
            return -1;
    }
}
