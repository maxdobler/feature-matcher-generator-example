package de.maxdobler.example.featurematcher;

import org.junit.Test;

import static de.maxdobler.example.featurematcher.BeanMatchers.withName;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class BeanTest {

    @Test
    public void testname() throws Exception {
        Bean bean = new Bean();
        bean.setName("name");
        assertThat(bean, withName(equalTo("name")));
    }
}