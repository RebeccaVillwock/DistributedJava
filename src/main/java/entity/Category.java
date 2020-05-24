package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(fetch= FetchType.EAGER ,mappedBy = "mini", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Mini> minis;


    public Category(){}

    public Category(String name){
        this.name = name;
    }

    public void add(Mini tempMini){
        if(minis == null){
            minis = new ArrayList<>();
        }
        minis.add(tempMini);
        tempMini.setCategory(this);
    }
}
