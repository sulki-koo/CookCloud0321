package cookcloud.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPE")
public class Recipe implements Serializable {

	private static final long serialVersionUID = 806653451936949L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long recipe_id;

	@Column
	private String recipe_title;

	@Column
	private String recipe_content;

	@Column
	private Long recipe_view_count;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime recipe_insert_at;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime recipe_update_at;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime recipe_delete_at;

	@Column
	private String recipe_is_deleted;

	@Column
	private Long likerank;

	@Column
	private Long recipe_board_code;

	@Column
	private String mem_id;

}
