package Lib;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

public class FarsiDateConvertor {

    private final static ULocale local = new ULocale("fa_IR@calender=persian");

    public static String now()
    {
        Calendar calendar = Calendar.getInstance(local);
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
        return df.format(calendar).replace(" ", " - ");
    }

    public static String DateToFarsiDate(LocalDate date)
    {
        Calendar calendar = Calendar.getInstance(local);
        calendar.setTimeInMillis(date.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
        return df.format(calendar).replace(" ", " - ");

    }

    public static Date FarsiDateToDate(Calendar calendar)
    {
        return new Date(calendar.getTimeInMillis());
    }

    public static String EpochToFarsiDate(long epoch)
    {
        Calendar calendar = Calendar.getInstance(local);
        calendar.setTimeInMillis(epoch);
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
        return df.format(calendar).replace(" ", " - ");
    }
}
