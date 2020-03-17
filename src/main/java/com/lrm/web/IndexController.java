package com.lrm.web;

import com.lrm.NotFoundException;
import com.lrm.service.BlogService;
import com.lrm.service.TagService;
import com.lrm.service.TypeService;
import com.lrm.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by limi on 2017/10/13.
 */
@Controller
public class IndexController {
    @Autowired
    BlogService blogService;
    @Autowired
    TagService tagService;

    @Autowired
    TypeService typeService;
    @GetMapping("/")
    public String index(@PageableDefault(size = 10,direction = Sort.Direction.DESC,sort = {"updateTime"}) Pageable pageable,
                         Model model) {
        model.addAttribute("page",blogService.listBlog(pageable));
        model.addAttribute("types",typeService.listTop(6));
        model.addAttribute("tags",tagService.listTop(10));
        model.addAttribute("recomendBlogs",blogService.listRecomendBlogTop(8));
        return "index";
    }

    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id,Model model) {
        model.addAttribute("blog",blogService.getAndConvert(id));
        return "blog";
    }

    @PostMapping("/search")
    public String search(@PageableDefault(size = 10,direction = Sort.Direction.DESC,sort = {"updateTime"}) Pageable pageable,
                         @RequestParam String query, Model model){
        model.addAttribute("page",blogService.listBlog("%"+query+"%",pageable));
        model.addAttribute("query",query);
        return "search";
    }
//    @GetMapping("/footer/newblog")
//    public String newblogs(Model model) {
//        model.addAttribute("newblogs", blogService.listRecommendBlogTop(3));
//        return "_fragments :: newblogList";
//    }


}
