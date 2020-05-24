package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="mini")
public class Mini {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mini_id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="category_id")
    private Category category;

    @OneToOne(mappedBy = "mini", cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
    private MiniDescription miniDescription;

    public Mini(){}

    public Mini(String name, String description){
        this.name = name;
        this.description = description;
    }
}
