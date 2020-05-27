package br.com.itsmemario.ecommerce.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-repository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
