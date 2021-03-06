/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.shopping.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ShoppingItemPrice}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ShoppingItemPrice
 * @generated
 */
public class ShoppingItemPriceWrapper implements ShoppingItemPrice,
	ModelWrapper<ShoppingItemPrice> {
	public ShoppingItemPriceWrapper(ShoppingItemPrice shoppingItemPrice) {
		_shoppingItemPrice = shoppingItemPrice;
	}

	public Class<?> getModelClass() {
		return ShoppingItemPrice.class;
	}

	public String getModelClassName() {
		return ShoppingItemPrice.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemPriceId", getItemPriceId());
		attributes.put("itemId", getItemId());
		attributes.put("minQuantity", getMinQuantity());
		attributes.put("maxQuantity", getMaxQuantity());
		attributes.put("price", getPrice());
		attributes.put("discount", getDiscount());
		attributes.put("taxable", getTaxable());
		attributes.put("shipping", getShipping());
		attributes.put("useShippingFormula", getUseShippingFormula());
		attributes.put("status", getStatus());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemPriceId = (Long)attributes.get("itemPriceId");

		if (itemPriceId != null) {
			setItemPriceId(itemPriceId);
		}

		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Integer minQuantity = (Integer)attributes.get("minQuantity");

		if (minQuantity != null) {
			setMinQuantity(minQuantity);
		}

		Integer maxQuantity = (Integer)attributes.get("maxQuantity");

		if (maxQuantity != null) {
			setMaxQuantity(maxQuantity);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Double discount = (Double)attributes.get("discount");

		if (discount != null) {
			setDiscount(discount);
		}

		Boolean taxable = (Boolean)attributes.get("taxable");

		if (taxable != null) {
			setTaxable(taxable);
		}

		Double shipping = (Double)attributes.get("shipping");

		if (shipping != null) {
			setShipping(shipping);
		}

		Boolean useShippingFormula = (Boolean)attributes.get(
				"useShippingFormula");

		if (useShippingFormula != null) {
			setUseShippingFormula(useShippingFormula);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this shopping item price.
	*
	* @return the primary key of this shopping item price
	*/
	public long getPrimaryKey() {
		return _shoppingItemPrice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this shopping item price.
	*
	* @param primaryKey the primary key of this shopping item price
	*/
	public void setPrimaryKey(long primaryKey) {
		_shoppingItemPrice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the item price ID of this shopping item price.
	*
	* @return the item price ID of this shopping item price
	*/
	public long getItemPriceId() {
		return _shoppingItemPrice.getItemPriceId();
	}

	/**
	* Sets the item price ID of this shopping item price.
	*
	* @param itemPriceId the item price ID of this shopping item price
	*/
	public void setItemPriceId(long itemPriceId) {
		_shoppingItemPrice.setItemPriceId(itemPriceId);
	}

	/**
	* Returns the item ID of this shopping item price.
	*
	* @return the item ID of this shopping item price
	*/
	public long getItemId() {
		return _shoppingItemPrice.getItemId();
	}

	/**
	* Sets the item ID of this shopping item price.
	*
	* @param itemId the item ID of this shopping item price
	*/
	public void setItemId(long itemId) {
		_shoppingItemPrice.setItemId(itemId);
	}

	/**
	* Returns the min quantity of this shopping item price.
	*
	* @return the min quantity of this shopping item price
	*/
	public int getMinQuantity() {
		return _shoppingItemPrice.getMinQuantity();
	}

	/**
	* Sets the min quantity of this shopping item price.
	*
	* @param minQuantity the min quantity of this shopping item price
	*/
	public void setMinQuantity(int minQuantity) {
		_shoppingItemPrice.setMinQuantity(minQuantity);
	}

	/**
	* Returns the max quantity of this shopping item price.
	*
	* @return the max quantity of this shopping item price
	*/
	public int getMaxQuantity() {
		return _shoppingItemPrice.getMaxQuantity();
	}

	/**
	* Sets the max quantity of this shopping item price.
	*
	* @param maxQuantity the max quantity of this shopping item price
	*/
	public void setMaxQuantity(int maxQuantity) {
		_shoppingItemPrice.setMaxQuantity(maxQuantity);
	}

	/**
	* Returns the price of this shopping item price.
	*
	* @return the price of this shopping item price
	*/
	public double getPrice() {
		return _shoppingItemPrice.getPrice();
	}

	/**
	* Sets the price of this shopping item price.
	*
	* @param price the price of this shopping item price
	*/
	public void setPrice(double price) {
		_shoppingItemPrice.setPrice(price);
	}

	/**
	* Returns the discount of this shopping item price.
	*
	* @return the discount of this shopping item price
	*/
	public double getDiscount() {
		return _shoppingItemPrice.getDiscount();
	}

	/**
	* Sets the discount of this shopping item price.
	*
	* @param discount the discount of this shopping item price
	*/
	public void setDiscount(double discount) {
		_shoppingItemPrice.setDiscount(discount);
	}

	/**
	* Returns the taxable of this shopping item price.
	*
	* @return the taxable of this shopping item price
	*/
	public boolean getTaxable() {
		return _shoppingItemPrice.getTaxable();
	}

	/**
	* Returns <code>true</code> if this shopping item price is taxable.
	*
	* @return <code>true</code> if this shopping item price is taxable; <code>false</code> otherwise
	*/
	public boolean isTaxable() {
		return _shoppingItemPrice.isTaxable();
	}

	/**
	* Sets whether this shopping item price is taxable.
	*
	* @param taxable the taxable of this shopping item price
	*/
	public void setTaxable(boolean taxable) {
		_shoppingItemPrice.setTaxable(taxable);
	}

	/**
	* Returns the shipping of this shopping item price.
	*
	* @return the shipping of this shopping item price
	*/
	public double getShipping() {
		return _shoppingItemPrice.getShipping();
	}

	/**
	* Sets the shipping of this shopping item price.
	*
	* @param shipping the shipping of this shopping item price
	*/
	public void setShipping(double shipping) {
		_shoppingItemPrice.setShipping(shipping);
	}

	/**
	* Returns the use shipping formula of this shopping item price.
	*
	* @return the use shipping formula of this shopping item price
	*/
	public boolean getUseShippingFormula() {
		return _shoppingItemPrice.getUseShippingFormula();
	}

	/**
	* Returns <code>true</code> if this shopping item price is use shipping formula.
	*
	* @return <code>true</code> if this shopping item price is use shipping formula; <code>false</code> otherwise
	*/
	public boolean isUseShippingFormula() {
		return _shoppingItemPrice.isUseShippingFormula();
	}

	/**
	* Sets whether this shopping item price is use shipping formula.
	*
	* @param useShippingFormula the use shipping formula of this shopping item price
	*/
	public void setUseShippingFormula(boolean useShippingFormula) {
		_shoppingItemPrice.setUseShippingFormula(useShippingFormula);
	}

	/**
	* Returns the status of this shopping item price.
	*
	* @return the status of this shopping item price
	*/
	public int getStatus() {
		return _shoppingItemPrice.getStatus();
	}

	/**
	* Sets the status of this shopping item price.
	*
	* @param status the status of this shopping item price
	*/
	public void setStatus(int status) {
		_shoppingItemPrice.setStatus(status);
	}

	public boolean isNew() {
		return _shoppingItemPrice.isNew();
	}

	public void setNew(boolean n) {
		_shoppingItemPrice.setNew(n);
	}

	public boolean isCachedModel() {
		return _shoppingItemPrice.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_shoppingItemPrice.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _shoppingItemPrice.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _shoppingItemPrice.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_shoppingItemPrice.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _shoppingItemPrice.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_shoppingItemPrice.setExpandoBridgeAttributes(baseModel);
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_shoppingItemPrice.setExpandoBridgeAttributes(expandoBridge);
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_shoppingItemPrice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ShoppingItemPriceWrapper((ShoppingItemPrice)_shoppingItemPrice.clone());
	}

	public int compareTo(
		com.liferay.portlet.shopping.model.ShoppingItemPrice shoppingItemPrice) {
		return _shoppingItemPrice.compareTo(shoppingItemPrice);
	}

	@Override
	public int hashCode() {
		return _shoppingItemPrice.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.liferay.portlet.shopping.model.ShoppingItemPrice> toCacheModel() {
		return _shoppingItemPrice.toCacheModel();
	}

	public com.liferay.portlet.shopping.model.ShoppingItemPrice toEscapedModel() {
		return new ShoppingItemPriceWrapper(_shoppingItemPrice.toEscapedModel());
	}

	public com.liferay.portlet.shopping.model.ShoppingItemPrice toUnescapedModel() {
		return new ShoppingItemPriceWrapper(_shoppingItemPrice.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _shoppingItemPrice.toString();
	}

	public java.lang.String toXmlString() {
		return _shoppingItemPrice.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_shoppingItemPrice.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public ShoppingItemPrice getWrappedShoppingItemPrice() {
		return _shoppingItemPrice;
	}

	public ShoppingItemPrice getWrappedModel() {
		return _shoppingItemPrice;
	}

	public void resetOriginalValues() {
		_shoppingItemPrice.resetOriginalValues();
	}

	private ShoppingItemPrice _shoppingItemPrice;
}