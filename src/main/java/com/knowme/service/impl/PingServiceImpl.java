package com.knowme.service.impl;

import com.knowme.service.PingService;
import com.knowme.vo.GenericResponseVo;
import org.springframework.stereotype.Service;

@Service
public class PingServiceImpl implements PingService {
    @Override
    public GenericResponseVo getPing() {
        GenericResponseVo responseVo = new GenericResponseVo();
        responseVo.setStatus("Pong");
        responseVo.setStatusMessage("Setup is ready.... !");
        return responseVo;
    }
}
