package de.maxdobler.example.featurematcher;

import ru.yandex.qatools.processors.matcher.gen.annotations.GenerateMatcher;

import java.math.BigDecimal;

@GenerateMatcher
public class Bean {

    private String name;
    private BigDecimal wert;
    private Bean2 bean2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWert() {
        return wert;
    }

    public void setWert(BigDecimal wert) {
        this.wert = wert;
    }

    public Bean2 getBean2() {
        return bean2;
    }

    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }
}
