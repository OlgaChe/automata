package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static utils.TestDataReader.getProperty;

public class UserData {

    /**
     * Generate unique username based on date time of creation
     */

    DateFormat dateFormat = new SimpleDateFormat("MMddHHmm");
    Date date = new Date();

    public String uniqueUsername =
            getProperty("userName")
                    + dateFormat.format(date)
                    + "_";

}
