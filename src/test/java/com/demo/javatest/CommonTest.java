package com.demo.javatest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴嘉豪
 * @date 2023/11/30 9:29
 */


/**
 * 1。 isBlank 可以判断字符串 不为空或者长度为 0的情况
 * 2.  isEmpty 可以判断集合为空或者长度为 0的情况
 *
 *
 *
 *
 */
//@SpringBootTest
@Slf4j(topic="testForString")
public class CommonTest {
    @Test
    void testForString(){
        String a = null;
        boolean blank = StringUtils.isNotBlank(a);

        log.info(String.valueOf(blank));
        // null -> true  , "" -> true

        a = "114514";
        log.info(a.substring(1, 4));
    }
    @Test
    void testForCollection() {
        // 如果 数组为null 或者数组的长度为 0， 那么这个时候， 你得到的工具类为 true
        List<Integer> a = null;
        log.info(String.valueOf(CollectionUtils.isEmpty(a)));

        a = new ArrayList<>();
        log.info(String.valueOf(CollectionUtils.isEmpty(a)));
    }

}
