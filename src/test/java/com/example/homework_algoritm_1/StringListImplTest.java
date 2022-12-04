package com.example.homework_algoritm_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.homework_algoritm_1.StringListImlConst.*;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;//импорт assertThat

class StringListImplTest {
    private final StringListImpl actualList=new StringListImpl();
    @BeforeEach
    void setUp() {
        actualList.add(VALUE_1);
        actualList.add(VALUE_2);
        actualList.add(VALUE_3);
        actualList.add(VALUE_4);
        actualList.add(VALUE_5);
    }

    @Test
    void add() {
        assertThat(actualList.toString()).isEqualTo(VALUE_1  + VALUE_2 + VALUE_3  + VALUE_4+VALUE_5);
    }

    @Test
    void testAdd() {
        actualList.add(1, VALUE_2);
        assertThat(actualList.toString()).isEqualTo(VALUE_1  + VALUE_2 +VALUE_2+ VALUE_3  + VALUE_4+VALUE_5);
    }
    @Test
    public void addByIndexNegative() {
        assertThatExceptionOfType(MyException.class).isThrownBy(() -> actualList.add(6, VALUE_5)).withMessage("некорректный индекс элемента");
    }

    @Test
    public void addValueNegative() {
        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> actualList.add(null))
                .withMessage("Значение строки не должно быть равно null");

        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> actualList.add(1, null))
                .withMessage("Значение строки не должно быть равно null");
    }


    @Test
    void set() {
        actualList.set(3, VALUE_1);
        assertThat(actualList.toString()).isEqualTo(VALUE_1+VALUE_2+ VALUE_3+VALUE_1+VALUE_5);
    }
    @Test
    public void setValueNegative() {
        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> actualList.set(2, null))
                .withMessage("Значение не должно быть равно null");

        assertThatExceptionOfType(MyException.class)
                .isThrownBy(() -> actualList.set(3, VALUE_2))
                .withMessage("Такого элемента не существует");

        assertThatExceptionOfType(MyException.class)
                .isThrownBy(() -> actualList.set(6, VALUE_1))
                .withMessage("Превышен размер внутреннего массива");
    }

    @Test
    void removeByIndex() {
        actualList.remove(1);
        assertThat(actualList.toString()).isEqualTo(VALUE_1 + VALUE_3+VALUE_4+VALUE_5);
    }

    @Test
    void testRemoveByItem() {
        actualList.remove(VALUE_3);
        assertThat(actualList.toString()).isEqualTo( VALUE_1  + VALUE_2  + VALUE_4);
    }

    @Test
    void contains() {
        assertThat(actualList.contains(VALUE_3)).isTrue();

        assertThat(actualList.contains("десять")).isFalse();
    }

    @Test
    void indexOf() {
        assertThat(actualList.indexOf(VALUE_2)).isEqualTo(2);

        assertThat(actualList.indexOf("Десять")).isEqualTo(-1);
    }

    @Test
    void lastIndexOf() {
        assertThat(actualList.lastIndexOf(VALUE_2)).isEqualTo(1);

        assertThat(actualList.lastIndexOf("Десять")).isEqualTo(-1);
    }

    @Test
    void get() {
        assertThat(actualList.get(2)).isEqualTo(VALUE_3);
    }

    @Test
    void size() {
        assertThat(actualList.size()).isEqualTo(5);
    }

    @Test
    void isEmpty() {
        assertThat(actualList.isEmpty()).isFalse();
        actualList.clear();
        assertThat(actualList.isEmpty()).isTrue();
    }}