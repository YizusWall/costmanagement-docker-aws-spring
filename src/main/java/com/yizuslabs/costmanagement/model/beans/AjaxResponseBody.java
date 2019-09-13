package com.yizuslabs.costmanagement.model.beans;


import com.yizuslabs.costmanagement.model.entity.TbUsuario;

import java.util.List;

public class AjaxResponseBody {

    String msg;
    List<TbUsuario> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<TbUsuario> getResult() {
        return result;
    }

    public void setResult(List<TbUsuario> result) {
        this.result = result;
    }

}
