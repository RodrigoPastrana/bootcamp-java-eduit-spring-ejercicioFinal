package ar.com.educacionit.feign;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.educacionit.entity.Posts;

@org.springframework.cloud.openfeign.FeignClient(value= "${app.feign.config.name}", url="${app.feign.config.url}")
public interface FeignClient {
  
    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Posts> readPosts();
	
}