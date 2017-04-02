package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_VAT_LY_KY_THUAT {
    final static String NAME_CLASS =  "Viện Vật Lý Kỹ Thuật";
    public static class CT_CU_NHAN_VAT_LY_KY_THUAT{
        final static String NAME_SUBCLASS = "Cử Nhân Vật Lý Kỹ Thuật";
        public static int getSoTC() {
            return 130;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_VAT_LY_KY_THUAT{
        final static String NAME_SUBCLASS = "Kỹ Sư Vật Lý Kỹ Thuật";
        public static int getSoTC() {
            return 162;
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
            if(nameSubClass.equals(CT_CU_NHAN_VAT_LY_KY_THUAT.getTen()))
                return CT_CU_NHAN_VAT_LY_KY_THUAT.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_VAT_LY_KY_THUAT.getTen()))
                return CT_KY_SU_VAT_LY_KY_THUAT.getSoTC();
            return -1;
        }else
            return -1;
    }


}
