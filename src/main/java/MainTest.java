import Lib.FarsiDateConvertor;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;

import java.time.LocalDate;
import java.util.Date;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("Testing!");
        System.out.println(FarsiDateConvertor.now());

        System.out.println(FarsiDateConvertor.EpochToFarsiDate(1714454569000L));

        Calendar calendar = Calendar.getInstance(new ULocale("fa_IR@calender=persian"));
        calendar.set(Calendar.YEAR, 1368);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 18);
        System.out.println(FarsiDateConvertor.FarsiDateToDate(calendar));

        LocalDate date = LocalDate.of(1985, 12, 5);
        System.out.println(FarsiDateConvertor.DateToFarsiDate(date));
    }
}
