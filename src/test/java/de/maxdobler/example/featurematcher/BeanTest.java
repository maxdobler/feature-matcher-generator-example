package de.maxdobler.example.featurematcher;

import org.junit.Test;

import static de.maxdobler.example.featurematcher.Bean2Matchers.withId;
import static de.maxdobler.example.featurematcher.BeanMatchers.withBean2;
import static de.maxdobler.example.featurematcher.BeanMatchers.withName;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class BeanTest {

    @Test
    public void testname() throws Exception {
        Bean bean = new Bean();
        Bean2 bean2 = new Bean2();
        bean2.setId(123L);

        bean.setName("name");
        bean.setBean2(bean2);

        assertThat(bean, withName(equalTo("name")));
        assertThat(bean, withBean2(withId(greaterThan(100L))));
    }
}