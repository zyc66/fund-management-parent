package com.wss.fund.constants;

public class FundSearchConstant {

    public static final String URI = "http://localhost:3000";
    /**
     * m 搜索类别
     * 搜基金: 1
     * 按字母公司搜基金: 3
     * 搜基金经理: 7
     * 搜基金公司: 8
     * key: 关键字，当值为3时,仅a-z有效
     * 结果/fundSearch?m=1&key=11
     */
    public static final String FUND_SEARCH = "/fundSearch?m=1";

    /**
     * 实时估值
     */
    private final static String GU_ZHI = "https://fundgz.1234567.com.cn/js/110031.js?rt=1589463125600";

}
