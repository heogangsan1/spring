package com.example.ex00.dependency;

import com.example.ex00.Tesk01.Outback;
import com.example.ex00.Tesk01.Resturant;
import com.example.ex00.Tesk01.Vips;
import com.example.ex00.qualifier.Computer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ResturantTest {
    @Autowired
    @Qualifier("Outback")
    private Outback outback;
    @Autowired @Qualifier("Vips")
    private Vips vips;
    @Autowired
    private Resturant resturant;

    @Test
    public void ResturantonTest(){

        log.info("Outbakc 스테이크 가격:"+outback + "");
        log.info("Vips 스테이크 가격:"+vips  + "");
        log.info("Resturant 스테이크 가격:"+resturant  + "");
        log.info("Outbakc 셀바 이용:"+outback.Use() + "");
        log.info("Vips 셀바 이용:"+vips.Use()  + "");
        log.info("Resturant 셀바 이용:"+resturant.Use()  + "");
    }
}
