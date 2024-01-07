/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.apluscontent;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.apluscontent.IntegerWithUnits;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The dimensions extending from the top left corner of the cropped image, or the top left corner of the original image if there is no cropping. Only &#x60;pixels&#x60; is allowed as the units value for ImageDimensions.
 */
@ApiModel(description = "The dimensions extending from the top left corner of the cropped image, or the top left corner of the original image if there is no cropping. Only `pixels` is allowed as the units value for ImageDimensions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-03T10:37:36.644+08:00")
public class ImageDimensions {
  @SerializedName("width")
  private IntegerWithUnits width = null;

  @SerializedName("height")
  private IntegerWithUnits height = null;

  public ImageDimensions width(IntegerWithUnits width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "")
  public IntegerWithUnits getWidth() {
    return width;
  }

  public void setWidth(IntegerWithUnits width) {
    this.width = width;
  }

  public ImageDimensions height(IntegerWithUnits height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "")
  public IntegerWithUnits getHeight() {
    return height;
  }

  public void setHeight(IntegerWithUnits height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDimensions imageDimensions = (ImageDimensions) o;
    return Objects.equals(this.width, imageDimensions.width) &&
        Objects.equals(this.height, imageDimensions.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDimensions {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

