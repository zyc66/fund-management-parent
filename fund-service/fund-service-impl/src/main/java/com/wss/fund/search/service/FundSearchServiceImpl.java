package com.wss.fund.search.service;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.wss.fund.constants.FundSearchConstant;
import com.wss.fund.search.dto.FundBaseInfo;
import com.wss.fund.search.dto.FundDTO;
import com.wss.fund.utils.HttpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/fundSearch")
public class FundSearchServiceImpl implements FundSearchService {
    @Override
    @RequestMapping("/fundCode")
    public FundDTO findByFundCode(String fundCode) throws IOException {
        String fundInfo = HttpUtil.sendGetRequest(FundSearchConstant.URI + FundSearchConstant.FUND_SEARCH+"&key="+fundCode);
        JSONObject jsonObject = JSONUtil.parseObj(fundInfo);
        JSONArray datas = jsonObject.getJSONArray("Datas");

        // 使用 Jackson 的 ObjectMapper 进行转换
        ObjectMapper objectMapper = new ObjectMapper();

        // 将 Java 对象转换为 JSON 字符串
//        String jsonString = objectMapper.writeValueAsString(datas.getStr(0));
        // 将 JSON 字符串转换为 Java 对象

        return objectMapper.readValue(datas.getStr(0), FundDTO.class);
    }
}
