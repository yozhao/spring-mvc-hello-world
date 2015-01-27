package com.example.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.service.HelloWorldRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Controller1")
public class HelloWorldController1 {
  @RequestMapping(value = "/get", method = RequestMethod.GET)
  @ResponseBody
  public String doGet(HelloWorldRequest request) {
    JSONObject json = new JSONObject();
    json.put("Controller", "HelloWorldController1");
    json.put("stringField", request.getStringField());
    json.put("numberField", request.getNumberField());
    return json.toString();
  }
}
