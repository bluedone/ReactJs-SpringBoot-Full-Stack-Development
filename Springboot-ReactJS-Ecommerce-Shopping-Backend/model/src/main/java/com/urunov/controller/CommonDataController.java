package com.urunov.controller;

import com.urunov.dto.ProductInfoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: hamdamboy
 * Project: model
 * Github: @urunov
 */

@RestController
public class CommonDataController {

    private ProductInfoDTO productInfoDTO;

    @GetMapping("/result")
    public ResponseEntity<?> getResult(){
        return (ResponseEntity<?>) productInfoDTO.getProducts();
    }

//    @Autowired
//    Environment environment;
//
//    @Autowired
//    CommonDataService commonDataService;
//
//    @Autowired
//    LoadFakeDataService loadFakeDataService;
//
//    public void fillWithTestDate() {
//        if (Objects.equals(environment.getProperty("ACTIVE_PROFILE"), "dev")) {
//            loadFakeDataService.loadTestData();
//        }
//    }
//
//    @GetMapping(value = "/products", params = "q")
//    public ResponseEntity<?> getProductsByCategories(@RequestParam("q") String queryParams) {
//        ProductInfoDTO productInfoDTO = commonDataService.getProductsByCategories(queryParams);
//
//        if (productInfoDTO == null) {
//            return ResponseEntity.badRequest().body("Query has not followed the required format.");
//        }
//        return ResponseEntity.ok(productInfoDTO);
//    }
//
//    @GetMapping(value = "/products", params = "product_id")
//    public ResponseEntity<?> getProductsById(@RequestParam("product_id") String queryParams) {
//        HashMap<Integer, ProductInfo> resultMap = commonDataService.getProductsById(queryParams);
//
//        if (resultMap == null) {
//            return ResponseEntity.badRequest().body("Query has not followed the required format.");
//        }
//
//        return ResponseEntity.ok(resultMap);
//    }
//
//
//    @GetMapping("/home")
//    public ResponseEntity<?> getMainScreenData() {
//
//        MainScreenResponse mainScreenInfoList = commonDataService.getHomeScreenData("homeAPI");
//        if (mainScreenInfoList == null) {
//            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
//        }
//
//        return ResponseEntity.ok(mainScreenInfoList);
//    }
//
//
//    @GetMapping("/tabs")
//    public ResponseEntity<?> getHomeTabsDataResponse(){
//        HomeTabsDataResponse homeTabsDataResponse = commonDataService.getBrandsAndApparelsByGender("tabsAPI");
//        if(homeTabsDataResponse == null)
//        {
//            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
//        }
//
//        return ResponseEntity.ok(homeTabsDataResponse);
//    }
//
//
//    @GetMapping(value = "/filter", params = "q")
//    public ResponseEntity<?> getFilterAttributesProducts(@RequestParam("g") String queryParams) {
//        String[] splitParams = queryParams.split("=");
//        if (splitParams.length >= 1 && splitParams[0].equals("productname")) {
//            queryParams = "category=all";
//        }
//
//        FilterAttributesResponse result = commonDataService.getFilterAttributesByProducts(queryParams);
//
//        if (result == null) {
//            return ResponseEntity.badRequest().body("Query has not followed the required format.");
//        }
//
//        return ResponseEntity.ok(result);
//    }
//
//    @GetMapping("/search-suggestion-list")
//    public ResponseEntity<?> getSearchSuggestionList() {
//        SearchSuggestionResponse searchSuggestionResponse = commonDataService.getSearchSuggestionList();
//        if (searchSuggestionResponse == null) {
//            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
//        }
//
//        return ResponseEntity.ok(searchSuggestionResponse);
//    }


}
