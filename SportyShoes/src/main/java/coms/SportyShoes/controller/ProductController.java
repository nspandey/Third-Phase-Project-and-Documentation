package coms.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import coms.SportyShoes.service.*;

@RestController
public class ProductController {

		@Autowired
		private ProductService productService;
}
