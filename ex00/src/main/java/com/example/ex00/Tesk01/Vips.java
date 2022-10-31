package com.example.ex00.Tesk01;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Vips")
@Getter
@ToString
@RequiredArgsConstructor
public class Vips implements Resturant{

    private int stakePrice = Resturant.steakPrice - 10000;



    public final boolean Use() {
        return true;
    }
}
