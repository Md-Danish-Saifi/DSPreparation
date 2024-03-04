package org.example.Algorithms;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class CalculateAge {
    public static void main(String[] args) {

        LocalDate first_date = LocalDate.of(1996, 11, 11);
        LocalDate second_date = LocalDate.of(2024, 03, 03);
        Period date = Period.between(first_date,second_date);
        System.out.println(date.getYears()+" Year :: "+ date.getMonths()+" Month :: "+date.getDays()+" Days");

    }
}
