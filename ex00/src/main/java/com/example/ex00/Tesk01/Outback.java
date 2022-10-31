package com.example.ex00.Tesk01;

import com.example.ex00.dependency.Computer;
import com.example.ex00.dependency.Restaurant;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Outback") @Primary
@Getter
@ToString
@RequiredArgsConstructor
public class Outback implements Resturant{

    private int stakePrice = Resturant.steakPrice + 10000;


    public final boolean Use() {
        return false;
    }
}
