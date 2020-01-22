package com.coco.demo.socketdemo.controller;


import com.coco.demo.socketdemo.service.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangzz
 */
@RestController
public class SocketController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/check")
    public String sendMessage() {
        return "启动成功！";
    }

    @RequestMapping("/broadcast")
    public String send(String msg) {
        WebSocket.broadcast("msg:{" + msg + "}");
        return "消息发送成功！消息：{" + msg + "}";
    }
    
}
