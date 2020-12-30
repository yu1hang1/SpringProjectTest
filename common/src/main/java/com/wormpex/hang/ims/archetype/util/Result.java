package com.wormpex.hang.ims.archetype.util;

import java.io.Serializable;
import java.util.Map;

/**
 * @program: hang
 * @description:
 * @author: yuhang
 * @create: 2019-07-23 19:12
 **/
public class Result implements Serializable {
    private static final long serialVersionUID = -3547371123278728849L;
    private int status;
    private String errmsg;
    private Map data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public static Result success(){
        Result result = new Result();
        result.status = 0;
        return result;
    }
    public static Result success(Map map){
        Result result = new Result();
        result.status = 0;
        result.setData(map);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.status = -1024;
        result.setErrmsg(msg);
        return result;
    }


}