package com.antodev;

public class SQLParser {

    private static SQLCache cache = new SQLCache();

    public SQLParser() {
//https://regex101.com/r/MSMR5V/1
    }

    public static void parse(String sql){
        if(sql.toLowerCase().startsWith("insert")){

        }else if(sql.toLowerCase().startsWith("update")){
            System.out.println(sql);
        }else if(sql.toLowerCase().startsWith("truncate")){

        }
    }

}