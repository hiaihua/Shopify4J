/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in TaxLine.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-01T17:54:50-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGTaxLine extends ShopifyResource {

	@JsonProperty("price")
	private String _price;
	@JsonProperty("price")
	public String getPrice(){ return _price;}
	@JsonProperty("price")
	public void setPrice(String _price){this._price = _price;}

	@JsonProperty("title")
	private String _title;
	@JsonProperty("title")
	public String getTitle(){ return _title;}
	@JsonProperty("title")
	public void setTitle(String _title){this._title = _title;}

	@JsonProperty("rate")
	private float _rate;
	@JsonProperty("rate")
	public float getRate(){ return _rate;}
	@JsonProperty("rate")
	public void setRate(float _rate){this._rate = _rate;}

}
