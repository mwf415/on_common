package cn.onlov.utils;


import java.util.Date;

public class OnStringUtils {

    public static void main(String[] args) {
        String aa ="";
        OnStringUtils.isNotEmpty(aa);
    }

    public static boolean isNotEmpty(String cs) {
        boolean result = false;
        if(null!=cs && cs.trim().length()>0){
            result=true ;
        }
        return result ;

    }


    public static boolean isNotEmpty(Integer num) {
        boolean result = false;
        if(null !=num && 0!=num){
            result= true;
        }
        return result ;
    }

    public static boolean isNotEmpty(Long num) {
        boolean result =false;
        if(null !=num && 0L !=num){
            result= true;
        }
        return result ;
    }

    public static boolean isNotEmpty(Date num) {
        boolean result =false;
        if(null !=num ){
            result= true;
        }
        return result ;
    }



}
