package com.wss.fund.search.service;

import com.wss.fund.search.dto.FundDTO;

import java.io.IOException;

public interface FundSearchService  {
    FundDTO findByFundCode(String fundCode) throws IOException;
}
