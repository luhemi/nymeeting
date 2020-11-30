package com.njupt.nymeeting.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(value = "会议VO")
public class MeetingVO {

    @ApiModelProperty(value = "会议id,更新时传入")
    private Long meetingId;

    @ApiModelProperty(value = "会议主题")
    private String subject;

    @ApiModelProperty(value = "会议描述")
    private String describle;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "会议开始时间")
    private Date startDate;

    @ApiModelProperty(value = "会议地点")
    private String site;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "签到开始时间")
    private Date signDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "签到结束时间")
    private Date endDate;

    @ApiModelProperty(value = "备注")
    private String remake;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "修改人")
    private String updateUser;
}
