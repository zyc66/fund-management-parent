package com.wss.fund.search.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 基金基础信息
 * @author yyds
 */
@Setter
@Getter
public class FundBaseInfo{
	/**
	 * 基金经理
	 */
	@JsonProperty("JJJL")
	private String fundManager;
	/**
	 * 基金类型
	 */
	@JsonProperty("FTYPE")
	private String fundType;
	/**
	 * 基金经理ID
	 */
	@JsonProperty("JJJLID")
	private String fundManagerId;
	/**
	 * 单位净值
	 */
	@JsonProperty("DWJZ")
	private Object netAssetValue;
	/**
	 * 名称缩写
	 */
	@JsonProperty("SHORTNAME")
	private String nameAbbreviation;
	/**
	 * 基金代码
	 */
	@JsonProperty("FCODE")
	private String fundCode;
	/**
	 * 发售日期
	 */
	@JsonProperty("FSRQ")
	private String saleDate;
	/**
	 * 基金公司
	 */
	@JsonProperty("JJGS")
	private String fundCompany;
	/**
	 * 基金公司BID
	 */
	@JsonProperty("JJGSBID")
	private int fundCompanyBid;
	/**
	 * 别名
	 */
	@JsonProperty("OTHERNAME")
	private String alias;
	/**
	 * 是否可以买入
	 */
	@JsonProperty("ISBUY")
	private String canBuy;
	/**
	 * 最小买入金额
	 */
	@JsonProperty("MINSG")
	private int minimumBuyAmount;
	/**
	 * 导航网址
	 */
	@JsonProperty("NAVURL")
	private String navigationUrl;
	/**
	 * id
	 */
	@JsonProperty("_id")
	private String id;
	/**
	 * 基金类型代码
	 */
	@JsonProperty("FUNDTYPE")
	private String fundTypeCode;
	/**
	 * 基金公司ID
	 */
	@JsonProperty("JJGSID")
	private String jJGSID;
}