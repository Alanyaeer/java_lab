package com.demo.javatest;

import com.demo.javatest.entity.OptionT;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author 吴嘉豪
 * @date 2023/11/30 9:43
 */
@Slf4j
public class SyntaxNewTest {



    // 如果一个集合为 null， 那么这里就会给出false 如果集合访问的元素为 null，那么这里就会给出false
    @Test
    void OptionTest() {
        List<Object> a = new ArrayList<>();
        boolean present = Optional
                .ofNullable(a)
                .isPresent();
        log.info(String.valueOf(present));
        a.add(null);
        boolean presents = Optional
                .ofNullable(a)
                .map(e->e.get(0))
                .isPresent();
        log.info(String.valueOf(presents));

    }

    // orElse 有值就返回， ，没有的话就返回 orElse 的内容
    @Test
    void OptionTest2(){
        OptionT b = null;
        boolean test1 = Optional.ofNullable(b)
                .isPresent();

        OptionT c = OptionT.builder()
                            .b("114514")
                            .c(3)
                            .build();

        boolean test2 = Optional.ofNullable(c)
                .map(OptionT::getB)
                .isPresent();
        String s = Optional.ofNullable(c)
                .map(OptionT::getB)
                .orElse("114514");

        Optional.ofNullable(c)
                .map(OptionT::getB)
                        .ifPresent(System.out::println);
        log.info(s);
        log.info(String.valueOf(test2));
    }

}
