package ua.lviv.iot.Lab3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FlowerLocality {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Flowers_Localities",
            joinColumns = {@JoinColumn(name = "flower_locality_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "flower_id", nullable = false)})
    @JsonIgnoreProperties("localities")
    private Set<Flower> flowers;

    private String name;

    public FlowerLocality() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(Set<Flower> flowers) {
        this.flowers = flowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
