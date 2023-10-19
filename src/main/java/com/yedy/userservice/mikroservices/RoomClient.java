package com.yedy.userservice.mikroservices;

import com.yedy.userservice.model.RoomDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "gateway-service")
public interface RoomClient {

    @GetMapping("/room/test")
    public RoomDto testRoom();
}
