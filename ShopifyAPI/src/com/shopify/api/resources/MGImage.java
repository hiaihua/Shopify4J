/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Image.java
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

public class MGImage extends ShopifyResource {

	@JsonProperty("position")
	private int _position;
	@JsonProperty("position")
	public int getPosition(){ return _position;}
	@JsonProperty("position")
	public void setPosition(int _position){this._position = _position;}

	@JsonProperty("product_id")
	private int _product_id;
	@JsonProperty("product_id")
	public int getProductId(){ return _product_id;}
	@JsonProperty("product_id")
	public void setProductId(int _product_id){this._product_id = _product_id;}

	@JsonProperty("src")
	private String _src;
	@JsonProperty("src")
	public String getSrc(){ return _src;}
	@JsonProperty("src")
	public void setSrc(String _src){this._src = _src;}

}
