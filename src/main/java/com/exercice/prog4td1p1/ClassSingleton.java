package com.exercice.prog4td1p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ClassSingleton {
    private static ClassSingleton INSTANCE ;
    private String description = "";

    public static ClassSingleton getINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new ClassSingleton();
        return INSTANCE;
    }
}
