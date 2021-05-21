package com.example.bootdata.entity;

import java.util.HashMap;

/**
 * user: ken
 * data: 2021/5/18 10:43
 */
public class R extends HashMap<String,Object> {

    public static R ok(){

       return ok(null);
    }

    public static R ok(Object data){
        R r = new R();
        r.put("status",200);
        r.put("msg","成功");
        r.put("isSuccess",true);
        r.put("data",data);

        return r;
    }

    public static R error(Integer status,String msg){

        R r = new R();
        r.put("status",status);
        r.put("msg",msg);
        r.put("isSuccess",false);
        r.put("data",null);

        return r;
    }
}
