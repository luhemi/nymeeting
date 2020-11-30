package com.njupt.nymeeting.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njupt.nymeeting.constant.OftenState;
import com.njupt.nymeeting.mapper.MeetingMapper;
import com.njupt.nymeeting.pojo.dto.MeetingDTO;
import com.njupt.nymeeting.pojo.vo.MeetingVO;
import com.njupt.nymeeting.pojo.vo.params.MeetingParamsVO;
import com.njupt.nymeeting.service.MeetingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhm
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MeetingServiceImpl implements MeetingService {

    @Resource
    MeetingMapper meetingMapper;

    @Override
    public void addMeeting(MeetingVO meetingVO) {
        meetingMapper.insertMeeting(meetingVO);
    }

    @Override
    public void updateMeeting(MeetingVO meetingVO) {
        meetingMapper.updateMeeting(meetingVO);
    }

    @Override
    public void deleteMeeting(Long meetingId) {
        MeetingVO meetingVO = new MeetingVO();
        meetingVO.setMeetingId(meetingId);
        meetingVO.setState(OftenState.DELETE_STATE);
        meetingMapper.updateMeeting(meetingVO);
    }

    @Override
    public MeetingDTO getMeeting(Long meetingId) {
        MeetingDTO meetingDTO = meetingMapper.selectMeeting(meetingId);
        return meetingDTO;
    }

    @Override
    public PageInfo<MeetingDTO> listMeeting(MeetingParamsVO meetingParamsVO) {
        //设置分页
        PageHelper.startPage(meetingParamsVO.getPageNum(),meetingParamsVO.getPageSize());
        //List查询
        List<MeetingDTO> meetingDTOList = meetingMapper.selectMeetingList();
        //处理结果
        PageInfo pageInfo = new PageInfo(meetingDTOList);

        return pageInfo;
    }
}
