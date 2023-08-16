# swagger-java-client

Selling Partner API for Pricing
- API version: v0
  - Build date: 2020-12-15T20:54:01.888+08:00

The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.

  For more information, please visit [https://sellercentral.amazon.com/gp/mws/contactus.html](https://sellercentral.amazon.com/gp/mws/contactus.html)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.amazon.spapi.productpricing.*;
import com.amazon.spapi.productpricing.auth.*;
import com.amazon.spapi.model.productpricing.*;
import com.amazon.spapi.productpricing.api.ProductPricingApi;

import java.io.File;
import java.util.*;

public class ProductPricingApiExample {

    public static void main(String[] args) {
        
        ProductPricingApi apiInstance = new ProductPricingApi();
        String marketplaceId = "marketplaceId_example"; // String | A marketplace identifier. Specifies the marketplace for which prices are returned.
        String itemType = "itemType_example"; // String | Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. Possible values: Asin, Sku.
        List<String> asins = Arrays.asList("asins_example"); // List<String> | A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace.
        List<String> skus = Arrays.asList("skus_example"); // List<String> | A list of up to twenty seller SKU values used to identify items in the given marketplace.
        try {
            GetPricingResponse result = apiInstance.getCompetitivePricing(marketplaceId, itemType, asins, skus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductPricingApi#getCompetitivePricing");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductPricingApi* | [**getCompetitivePricing**](ProductPricingApi.md#getCompetitivePricing) | **GET** /products/pricing/v0/competitivePrice | 
*ProductPricingApi* | [**getItemOffers**](ProductPricingApi.md#getItemOffers) | **GET** /products/pricing/v0/items/{Asin}/offers | 
*ProductPricingApi* | [**getListingOffers**](ProductPricingApi.md#getListingOffers) | **GET** /products/pricing/v0/listings/{SellerSKU}/offers | 
*ProductPricingApi* | [**getPricing**](ProductPricingApi.md#getPricing) | **GET** /products/pricing/v0/price | 


## Documentation for Models

 - [ASINIdentifier](ASINIdentifier.md)
 - [AttributeSetList](AttributeSetList.md)
 - [BuyBoxEligibleOffers](BuyBoxEligibleOffers.md)
 - [BuyBoxPriceType](BuyBoxPriceType.md)
 - [BuyBoxPrices](BuyBoxPrices.md)
 - [CompetitivePriceList](CompetitivePriceList.md)
 - [CompetitivePriceType](CompetitivePriceType.md)
 - [CompetitivePricingType](CompetitivePricingType.md)
 - [ConditionType](ConditionType.md)
 - [DetailedShippingTimeType](DetailedShippingTimeType.md)
 - [Error](../Error.md)
 - [ErrorList](../ErrorList.md)
 - [FulfillmentChannelType](FulfillmentChannelType.md)
 - [GetOffersResponse](GetOffersResponse.md)
 - [GetOffersResult](GetOffersResult.md)
 - [GetPricingResponse](GetPricingResponse.md)
 - [IdentifierType](IdentifierType.md)
 - [ItemIdentifier](ItemIdentifier.md)
 - [LowestPriceType](LowestPriceType.md)
 - [LowestPrices](LowestPrices.md)
 - [MoneyType](MoneyType.md)
 - [NumberOfOfferListingsList](NumberOfOfferListingsList.md)
 - [NumberOfOffers](NumberOfOffers.md)
 - [OfferCountType](OfferCountType.md)
 - [OfferDetail](OfferDetail.md)
 - [OfferDetailList](OfferDetailList.md)
 - [OfferListingCountType](OfferListingCountType.md)
 - [OfferType](OfferType.md)
 - [OffersList](OffersList.md)
 - [Points](Points.md)
 - [Price](Price.md)
 - [PriceList](PriceList.md)
 - [PriceType](PriceType.md)
 - [Product](Product.md)
 - [RelationshipList](RelationshipList.md)
 - [SalesRankList](SalesRankList.md)
 - [SalesRankType](SalesRankType.md)
 - [SellerFeedbackType](SellerFeedbackType.md)
 - [SellerSKUIdentifier](SellerSKUIdentifier.md)
 - [ShipsFromType](ShipsFromType.md)
 - [Summary](Summary.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


