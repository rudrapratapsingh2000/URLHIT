package com.URLHitCount.Controller;

import com.URLHitCount.Model.Url;
import com.URLHitCount.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlController {
@Autowired
    public UrlService urlService;
    public UrlController(UrlService urlService){
    this.urlService=urlService;
}
    @GetMapping("/count")
    public int getHitCount() {
        return urlService.countHit();
    }
    //http://localhost:8080/api/v1/visitor-count-app/username/{yourusername}/count
    @GetMapping("/username/{username}/count")
    public Url getHitCount(@PathVariable String username){
        Url url=urlService.getVisits(username);
        return  url;
    }
}
