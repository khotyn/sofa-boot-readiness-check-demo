package com.alipay.sofa.rpcserver;

public class SampleServiceImpl implements SampleService {
    @Override
    public String hello() {
        return "Hello";
    }
}
