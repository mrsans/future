package org.future.source.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhpj
 * @date: 2022-03-04 19:43
 */
@Slf4j
public class TestArrayList {

    // 查询集合中的元素索引位置
    @Test
    public void testLastIndexOf() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("4576");
        list.add("9723e9");
        list.add("9723e9324");
        log.info("lastIndexOf查询到的元素为：{}", list.lastIndexOf("123"));
    }

    // 查询集合中的元素索引位置
    @Test
    public void testIndexOf() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("4576");
        list.add("9723e9");
        list.add("9723e9324");
        log.info("indexOf查询到的元素为：{}", list.indexOf("4576"));
    }

    // 查询集合中的元素
    @Test
    public void testGet() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("4576");
        list.add("9723e9");
        list.add("9723e9324");
        log.info("get查询到的元素为：{}", list.get(2));
    }

    // 测试集合添加元素
    @Test
    public void testAdd() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        log.info("data：{}", list);
    }

    @Test
    public void testAddAll() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");
        List<String> tempList = new ArrayList<>();
        tempList.add("new-temp-1");
        tempList.add("new-temp-2");
        list.addAll(tempList);
        log.info("data：{}", list);
        list.addAll(1, tempList);
        log.info("data：{}", list);
    }

    @Test
    public void testConstruct() {
        // 创建一个ArrayList对象 没有任何元素
        List<String> list_1 = new ArrayList<>();
        // 创建有一定空间的对象
        List<String> list_2 = new ArrayList<>(12);
        // 传递一个集合，创建一个将此参数集合平铺的初始化集合
        List<String> tempList = new ArrayList<>();
        tempList.add("123");
        tempList.add("1234");
        List<String> list_3 = new ArrayList<>(tempList);

        log.info("无参数构造函数, size:{}, data:{}", list_1.size(), list_1);
        log.info("创建一个有初始化容量的集合, size:{}, data:{}", list_2.size(), list_2);
        log.info("创建一个有初始化元素的集合, size:{}, data:{}", list_3.size(), list_3);
    }


}
