package de.maxdobler.example.featurematcher;

import ru.yandex.qatools.processors.matcher.gen.annotations.GenerateMatcher;

public class Bean2 {

    @GenerateMatcher
    private Long id;
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
