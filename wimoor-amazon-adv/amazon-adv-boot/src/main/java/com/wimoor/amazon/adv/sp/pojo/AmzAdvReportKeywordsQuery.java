package com.wimoor.amazon.adv.sp.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wimoor.amazon.adv.common.pojo.BaseObject;
import com.wimoor.amazon.adv.common.pojo.JsonBigIntergeSerializer;
 
 

@Entity
@Table(name="t_amz_adv_rpt2_sp_keywords_query")
public class AmzAdvReportKeywordsQuery   extends BaseObject  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4230388104727633736L;

	@Id
	@Column(name="keywordId")
	@JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger keywordid;
	
	@Column(name="adGroupId")
	@JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger adgroupid;
	
	@Column(name="campaignId")
	@JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger campaignid;
	
	@Id
	@Column(name="bydate")
    private Date bydate;
	
	@Column(name="profileid")
	@JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger profileid;
	
	@Id
	@Column(name="queryid")
    private BigInteger queryid;
	
	@Column(name="impressions")
    private Integer impressions;

	@Column(name="clicks")
    private Integer clicks;

	@Column(name="cost")
    private BigDecimal cost;

	@Column(name="opttime")
    private Date opttime;
	
	
	public BigInteger getKeywordid() {
		return keywordid;
	}

	public void setKeywordid(BigInteger keywordid) {
		this.keywordid = keywordid;
	}

	public BigInteger getAdgroupid() {
		return adgroupid;
	}

	public void setAdgroupid(BigInteger adgroupid) {
		this.adgroupid = adgroupid;
	}

	public BigInteger getCampaignid() {
		return campaignid;
	}

	public void setCampaignid(BigInteger campaignid) {
		this.campaignid = campaignid;
	}

	public Date getBydate() {
        return bydate;
    }

    public void setBydate(Date bydate) {
        this.bydate = bydate;
    }
 
	public BigInteger getProfileid() {
        return profileid;
    }

    public void setProfileid(BigInteger profileid) {
        this.profileid = profileid  ;
    }
 
 
    public Integer getImpressions() {
        return impressions;
    }

    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

	public BigInteger getQueryid() {
		return queryid;
	}

	public void setQueryid(BigInteger queryid) {
		this.queryid = queryid;
	}

	public Date getOpttime() {
		return opttime;
	}

	public void setOpttime(Date opttime) {
		this.opttime = opttime;
	}

   
}