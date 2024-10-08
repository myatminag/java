package com.jdc.pos.features;

import com.jdc.console.app.AbstractFeature;
import com.jdc.pos.models.ProductModel;

public class ProductSearchFeature extends AbstractFeature {
	
	private ProductModel model;

	public ProductSearchFeature(int id, ProductModel model) {
		super(id, "Search Product");
		this.model = model;
	}

	@Override
	public void doBusiness() {
		System.out.println("Please enter product id.");
		
		var id = getInputInt("Enter id : ");
		var product = model.findById(id);
		
		if (product == null) {
			System.out.printf("There is no product with %d.%n%n", id);
			return;
		}
		
		System.out.printf("Product name  : %s.%n", product.name());
		System.out.printf("Product price : %d.%n%n", product.price());
	}

}
