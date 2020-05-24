package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="mini_description")
public class MiniDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mini_id")
    private int id;

    @Column(name="species")
    private String species;

    @Column(name="clothes")
    private String clothes;

    @Column(name="physical_description")
    private String physicalDescription;

    @Column(name="items")
    private String items;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mini_id")
    private Mini mini;

    public MiniDescription(){}

    public MiniDescription(String species, String clothes, String physicalDescription, String items){
        this.species = species;
        this.clothes = clothes;
        this.physicalDescription = physicalDescription;
        this.items = items;
    }
}
