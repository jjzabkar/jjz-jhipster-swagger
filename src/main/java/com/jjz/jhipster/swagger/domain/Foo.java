package com.jjz.jhipster.swagger.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Foo.
 */
@Entity
@Table(name = "foo")
public class Foo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bar")
    private String bar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Foo foo = (Foo) o;
        return Objects.equals(id, foo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Foo{" +
            "id=" + id +
            ", bar='" + bar + "'" +
            '}';
    }
}
