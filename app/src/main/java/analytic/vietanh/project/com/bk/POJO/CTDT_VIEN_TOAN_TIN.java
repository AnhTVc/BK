package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_TOAN_TIN {
    final static String NAME_CLASS = "Viện Toán Tin";

    public static class CT_CU_NHAN_TOAN_TIN_UNG_DUNG{
        final static String NAME_SUBCLASS = "CN Toán Tin Ứng Dụng";
        public static int getSoTC() {
            return 132;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_TOAN_TIN_UNG_DUNG{
        final static String NAME_SUBCLASS = "KSToán Tin Ứng Dụng";
        public static int getSoTC() {
            return 164;
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
            if(nameSubClass.equals(CT_CU_NHAN_TOAN_TIN_UNG_DUNG.getTen()))
                return CT_CU_NHAN_TOAN_TIN_UNG_DUNG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_TOAN_TIN_UNG_DUNG.getTen()))
                return CT_KY_SU_TOAN_TIN_UNG_DUNG.getSoTC();
            return -1;
        }else
            return -1;
    }
}
