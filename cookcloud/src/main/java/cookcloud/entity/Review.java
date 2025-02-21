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
@Table(name = "REVIEW")
public class Review implements Serializable {

	private static final long serialVersionUID = 418579298651982L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REVIEW_ID, nullable = false")
	private Long reviewId;

	@Column(name = "REVIEW_CONTENT", columnDefinition = "NVARCHAR2(1000)", nullable = false)
	private String reviewContent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REVIEW_INSERT_AT", nullable = false)
	private LocalDateTime reviewInsertAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REVIEW_UPDATE_AT")
	private LocalDateTime reviewUpdateAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REVIEW_DELETE_AT")
	private LocalDateTime reviewDeleteAt;

	@Column(name = "REVIEW_IS_DELETED", columnDefinition = "CHAR(1)", nullable = false)
	private String reviewIsDeleted;

	@Column(name = "RECIPE_ID", nullable = false)
	private Long recipeId;

	@Column(name = "MEM_ID", columnDefinition = "VARCHAR2(20)", nullable = false)
	private String memId;

}
