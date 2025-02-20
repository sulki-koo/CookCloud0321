package cookcloud.entity;

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

	private static final long serialVersionUID = 562040398472513L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="RECIPE_ID")
	private Long recipeId;

	@Column(name="RECIPE_TITLE", columnDefinition = "NVARCHAR2(100)")
	private String recipeTitle;

	@Column(name="RECIPE_CONTENT", columnDefinition = "NVARCHAR2(2000)")
	private String recipeContent;

	@Column(name="RECIPE_VIEW_COUNT")
	private Long recipeViewCount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECIPE_INSERT_AT")
	private LocalDateTime recipeInsertAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECIPE_UPDATE_AT")
	private LocalDateTime recipeUpdateAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECIPE_DELETE_AT")
	private LocalDateTime recipeDeleteAt;

	@Column(name="RECIPE_IS_DELETED", columnDefinition = "CHAR(1)")
	private String recipeIsDeleted;

	@Column(name="RECIPE_BOARD_CODE")
	private Long recipeBoardCode;

	@Column(name="LIKERANK")
	private Long likeRank;

	@Column(name="MEM_ID", columnDefinition = "VARCHAR2(20)")
	private String memId;

}