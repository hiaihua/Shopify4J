/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Asset.java
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

public class MGAsset extends ShopifyResource {

	@JsonProperty("public_url")
	private String _public_url;
	@JsonProperty("public_url")
	public String getPublicUrl(){ return _public_url;}
	@JsonProperty("public_url")
	public void setPublicUrl(String _public_url){this._public_url = _public_url;}

	@JsonProperty("value")
	private String _value;
	@JsonProperty("value")
	public String getValue(){ return _value;}
	@JsonProperty("value")
	public void setValue(String _value){this._value = _value;}

	@JsonProperty("key")
	private String _key;
	@JsonProperty("key")
	public String getKey(){ return _key;}
	@JsonProperty("key")
	public void setKey(String _key){this._key = _key;}

}
