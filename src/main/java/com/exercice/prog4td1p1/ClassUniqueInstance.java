package com.exercice.prog4td1p1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public enum ClassUniqueInstance {
    INSTANCE();

    private int click;

    public ClassUniqueInstance getInstance(){
        return INSTANCE;
    }
    public void setClick(int click) {
        this.click = click;
    }
}
