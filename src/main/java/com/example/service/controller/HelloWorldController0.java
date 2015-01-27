package com.example.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.service.HelloWorldRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Controller0")
public class HelloWorldController0 {
  @RequestMapping(value = "/get", method = RequestMethod.GET)
  @ResponseBody
  public String doGet(HelloWorldRequest request) {
    JSONObject json = new JSONObject();
    json.put("Controller", "HelloWorldController0");
    json.put("stringField", request.getStringField());
    json.put("numberField", request.getNumberField());
    return json.toString();
  }
  @RequestMapping(value = "/echo", method = RequestMethod.GET)
  @ResponseBody
  public String echo() {
    return  "Hello World!";
  }
}
