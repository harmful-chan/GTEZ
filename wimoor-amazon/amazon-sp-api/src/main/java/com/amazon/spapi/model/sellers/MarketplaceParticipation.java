/*
 * Selling Partner API for Sellers
 * The Selling Partner API for Sellers lets you retrieve information on behalf of sellers about their seller account, such as the marketplaces they participate in. Along with listing the marketplaces that a seller can sell in, the API also provides additional information about the marketplace such as the default language and the default currency. The API also provides seller-specific information such as whether the seller has suspended listings in that marketplace.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.sellers;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * MarketplaceParticipation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-25T13:43:40.699+08:00")
public class MarketplaceParticipation {
  @SerializedName("marketplace")
  private Marketplace marketplace = null;

  @SerializedName("participation")
  private Participation participation = null;

  public MarketplaceParticipation marketplace(Marketplace marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/
  @ApiModelProperty(required = true, value = "")
  public Marketplace getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(Marketplace marketplace) {
    this.marketplace = marketplace;
  }

  public MarketplaceParticipation participation(Participation participation) {
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  @ApiModelProperty(required = true, value = "")
  public Participation getParticipation() {
    return participation;
  }

  public void setParticipation(Participation participation) {
    this.participation = participation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceParticipation marketplaceParticipation = (MarketplaceParticipation) o;
    return Objects.equals(this.marketplace, marketplaceParticipation.marketplace) &&
        Objects.equals(this.participation, marketplaceParticipation.participation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, participation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceParticipation {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

