package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/11/17.
 */

public final class CTDT_KY_SU_CHAT_LUONG_CAO {
    final static String NAME_CLASS = "Chương Trình Chất Lượng Cao";
    public static class CTKSCLC_HE_THONG_THONG_TIN_VA_TRUYEN_THONG{
        final static String NAME_SUBCLASS = "KS Hệ Thống Thông Tin-Truyền Thông";
        public static int getSoTC() {
            return 218;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CTKSCLC_TIN_HOC_CONG_NGHIEP{
        final static String NAME_SUBCLASS = "KS Tin Học Công Nghiệp";
        public static int getSoTC() {
            return 215;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CTKSCTKSCLC_KY_THUAT_HANG_KHONG {
        final static String NAME_SUBCLASS = "KS Kỹ Thuật Hàng Không";
        public static int getSoTC() {
            return 235;
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
            if(nameSubClass.equals(CTKSCLC_HE_THONG_THONG_TIN_VA_TRUYEN_THONG.getTen()))
                return CTKSCLC_HE_THONG_THONG_TIN_VA_TRUYEN_THONG.getSoTC();
            else if(nameSubClass.equals(CTKSCLC_TIN_HOC_CONG_NGHIEP.getTen()))
                return CTKSCLC_TIN_HOC_CONG_NGHIEP.getSoTC();
            else if(nameSubClass.equals(CTKSCTKSCLC_KY_THUAT_HANG_KHONG.getTen()))
                return CTKSCTKSCLC_KY_THUAT_HANG_KHONG.getSoTC();
            return -1;
        }else
            return -1;
    }
}