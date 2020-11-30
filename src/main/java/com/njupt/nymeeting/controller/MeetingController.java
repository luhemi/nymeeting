package com.njupt.nymeeting.controller;

import com.github.pagehelper.PageInfo;
import com.njupt.nymeeting.base.JsonResult;
import com.njupt.nymeeting.pojo.dto.MeetingDTO;
import com.njupt.nymeeting.pojo.vo.MeetingVO;
import com.njupt.nymeeting.pojo.vo.params.MeetingParamsVO;
import com.njupt.nymeeting.service.MeetingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lhm
 */
@RestController
@RequestMapping("meeting")
@Api(value = "meeting",tags = "会议接口",position = 1)
public class MeetingController {

    @Autowired
    MeetingService meetingService;

    @PostMapping("addMeeting")
    @ApiOperation(value = "增加会议")
    public JsonResult addMeeting(@RequestBody MeetingVO meetingVO){
        meetingService.addMeeting(meetingVO);
        return JsonResult.ok();
    }

    @PostMapping("updateMeeting")
    @ApiOperation(value = "修改会议")
    public JsonResult updateMeeting(@RequestBody MeetingVO meetingVO){
        meetingService.updateMeeting(meetingVO);
        return JsonResult.ok();
    }

    @PostMapping("deleteMeeting")
    @ApiOperation(value = "删除会议")
    public JsonResult deleteMeeting(@RequestParam Long meetingId){
        meetingService.deleteMeeting(meetingId);
        return JsonResult.ok();
    }

    @GetMapping("getMeeting")
    @ApiOperation(value = "获取会议详情")
    public JsonResult getMeeting(@RequestParam Long meetingId){
        MeetingDTO meetingDTO = meetingService.getMeeting(meetingId);
        return JsonResult.ok(meetingDTO);
    }

    @PostMapping("listMeeting")
    @ApiOperation(value = "获取会议列表")
    public JsonResult listMeeting(@RequestBody MeetingParamsVO meetingParamsVO){
        if(meetingParamsVO.getPageNum() == null){
            meetingParamsVO.setPageNum(1);
        }
        if(meetingParamsVO.getPageSize() == null){
            meetingParamsVO.setPageSize(10);
        }
        PageInfo<MeetingDTO> meetingDTOPageInfo = meetingService.listMeeting(meetingParamsVO);
        return JsonResult.ok(meetingDTOPageInfo);
    }

}
