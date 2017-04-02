package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_KY_THUAT_NHIET_LANH {
    final static String NAME_CLASS ="Viện Kỹ Thuật Nhiệt Lạnh";
    public static class CT_CU_NHAN_KY_THUAT_NHIET{
        final static String NAME_SUBCLASS ="Cử Nhân Kỹ Thuật Nhiệt";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_NHIET{
        final static String NAME_SUBCLASS = "Kỹ Sư Nhiệt";

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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_NHIET.getTen()))
                return CT_CU_NHAN_KY_THUAT_NHIET.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_NHIET.getTen()))
                return CT_KY_SU_KY_THUAT_NHIET.getSoTC();
            return -1;
        }else
            return -1;
    }
}
