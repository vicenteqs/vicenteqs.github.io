package es.vqs.memorial;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Nadador implements Serializable {
	private static final long serialVersionUID = -2216382168252563212L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "id_serie")
	private Serie serie;
	private String nombre;
	private String club;
	private Integer calle;
}
