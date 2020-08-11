package com.templateloop.demo.controller;

import com.templateloop.demo.pojo.Category;
import com.templateloop.demo.pojo.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    //返回分栏目的商品列表
    @GetMapping("/category")
    public String home(Model model) {
        //统一使用一个list返回
        ArrayList<Map<String,Object>> list = new ArrayList<>();

        //每个分类及分类下的推荐商品，用一个map来保存
        Map<String,Object> map1 = new HashMap<String,Object>();
        Category category1 = new Category();

        category1.setCategoryId(1L);
        category1.setCategoryName("家居");
        map1.put("category",category1);

        //保存商品用的list
        ArrayList<Goods> listGoods1 = new ArrayList<Goods>();

        Goods goods1 = new Goods();
        goods1.setGoodsId(1L);
        goods1.setGoodsName("无线智能感应灯");
        listGoods1.add(goods1);
        Goods goods2 = new Goods();
        goods2.setGoodsId(2L);
        goods2.setGoodsName("朱之光落地灯");
        listGoods1.add(goods2);
        Goods goods3 = new Goods();
        goods3.setGoodsId(3L);
        goods3.setGoodsName("儿童抗首菌枕头");
        listGoods1.add(goods3);
        Goods goods4 = new Goods();
        goods4.setGoodsId(4L);
        goods4.setGoodsName("按摩床垫升级款");
        listGoods1.add(goods4);
        Goods goods5 = new Goods();
        goods5.setGoodsId(5L);
        goods5.setGoodsName("北欧简约金属茶几");
        listGoods1.add(goods5);
        map1.put("goodslist",listGoods1);

        //把map1添加到list
        list.add(map1);

        Map<String,Object> map2 = new HashMap<String,Object>();
        Category category2 = new Category();
        category2.setCategoryId(2L);
        category2.setCategoryName("美护");
        map2.put("category",category2);
        ArrayList<Goods> listGoods2 = new ArrayList<Goods>();


        Goods goods21 = new Goods();
        goods21.setGoodsId(21L);
        goods21.setGoodsName("护手霜套装");
        listGoods2.add(goods21);
        Goods goods22 = new Goods();
        goods22.setGoodsId(22L);
        goods22.setGoodsName("美白牙贴");
        listGoods2.add(goods22);
        Goods goods23 = new Goods();
        goods23.setGoodsId(23L);
        goods23.setGoodsName("口腔护理泡沫");
        listGoods2.add(goods23);
        map2.put("goodslist",listGoods2);
        //把map2添加到list
        list.add(map2);

        Map<String,Object> map3 = new HashMap<String,Object>();
        Category category3 = new Category();
        category3.setCategoryId(3L);
        category3.setCategoryName("服装");
        map3.put("category",category3);
        ArrayList<Goods> listGoods3 = new ArrayList<Goods>();


        Goods goods31 = new Goods();
        goods31.setGoodsId(31L);
        goods31.setGoodsName("纯色真丝睡袍");
        listGoods3.add(goods31);
        Goods goods32 = new Goods();
        goods32.setGoodsId(32L);
        goods32.setGoodsName("蚕丝条纹睡衣套装");
        listGoods3.add(goods32);
        Goods goods33 = new Goods();
        goods33.setGoodsId(33L);
        goods33.setGoodsName("牛津长袖衬衫");
        listGoods3.add(goods33);
        map3.put("goodslist",listGoods3);
        ////把map3添加到list
        list.add(map3);

        //把list传递给模板
        model.addAttribute("list",list);
        return "home/category.html";
    }
}