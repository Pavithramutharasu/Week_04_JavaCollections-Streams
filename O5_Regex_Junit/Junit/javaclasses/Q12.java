package javaclasses;

import java.util.*;
import java.text.*;
public class Q12 {
	public String formatDate(String inputDate) throws ParseException{
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = inputFormat.parse(inputDate);
        return outputFormat.format(date);

    }

}
