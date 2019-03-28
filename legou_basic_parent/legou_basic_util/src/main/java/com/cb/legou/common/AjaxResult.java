package com.cb.legou.common;

public class AjaxResult {

//测试一哈
public static void main(String[] args) {
    AjaxResult.me().setSuccess(false).setMsg("小老弟出错了").setObj(null);
}

    private  Boolean success=true;
    private  String msg="成了";
    private  Object obj=null ;


    //整一个链式编程，方便吧，花里胡哨的

    public  static AjaxResult me(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success =success;
            return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public AjaxResult setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
