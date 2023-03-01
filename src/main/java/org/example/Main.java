package org.example;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;
import org.example.bean.Data;
import org.example.bean.Item;
import org.example.bean.Month;
import org.example.bean.People;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
//        System.out.println(new String(Files.readAllBytes(Paths.get("test2.json"))));
        List<Item> items = new Gson().fromJson(
                new String(Files.readAllBytes(Paths.get("test2.json"))),
                new TypeToken<List<Item>>() {}.getType());

        Map<String, Month> months = new HashMap<>();

        items.stream()
                .forEach(i -> {
                    Month month;
                    try {
                        month = getMoths(i.getName());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    if (months.containsKey(month.getName())) {
                        months.get(month.getName()).addValue();
                    } else {
                        month.addValue();
                        months.put(month.getName(), month);
                    }
                });

        months.values().forEach(v -> System.out.println(v.getName()));
    }

    private static Month getMoths(String date) throws Exception {
        if (Strings.isNullOrEmpty(date)) {
            System.out.println(" ##### NULL ");
            return new Month("x");
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
            Date date3 = formatter.parse(StringUtils.substringBefore(date, "T"));
            String formattedDateString = formatter.format(date3);
            return new Month(formattedDateString);
        }
    }
}
