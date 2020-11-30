package com.njupt.nymeeting.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

@Data
@ApiModel(value = "JsonResult", description = "返回结果Json")
public class JsonResult {
    @Ignore
    @ApiModelProperty(value = "返回数据")
    private Object data;
    @ApiModelProperty(value = "状态码", required = true, example = "200")
    private Integer status;
    @ApiModelProperty(value = "返回信息", required = true)
    private String msg;
    @ApiModelProperty(value = "时间戳", required = true)
    private String time = String.valueOf(System.currentTimeMillis());

    public JsonResult() {
    }

    public JsonResult(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public JsonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult build(Object data, Integer status, String msg) {
        return new JsonResult(status, msg, data);
    }

    public static JsonResult ok() {
        return new JsonResult(200, "success", null);
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(200, "success", data);
    }

    public static JsonResult errorMsg(String msg) {
        return new JsonResult(500, msg);
    }

    public static JsonResult errorData(Object data) {
        return new JsonResult(501, "error", data);
    }

    public static JsonResult errorTokenMsg(String msg) {
        return new JsonResult(502, msg);
    }

    public static JsonResult errorException(String msg) {
        return new JsonResult(555, msg, null);
    }
}
