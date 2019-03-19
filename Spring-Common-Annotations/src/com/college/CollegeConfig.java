package com.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*Agr hum @Configuration and @ComponentScan(basePackages = "com.college") use kr rahy hen to hmen 
alg se xml file bnane ki zaroorat nhn hy. Jis class ko hmen apni configuration class bnani hy us 
class k oper @Configuration annotation lga deni hy bus or us k sath @ComponentScan(basePackages = "com.college")
annotation lagani hy kun k is k through hum IOC container ko btaen gy k tume kin classes k object bnane hy 
is main hun basePackages property use ki hy is k though hum bta rahy hen k hmari classes kis package
main pri hen */

@Configuration
@ComponentScan(basePackages = "com.college")
public class CollegeConfig {

}
