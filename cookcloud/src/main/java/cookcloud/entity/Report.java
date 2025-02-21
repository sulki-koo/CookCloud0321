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
@Table(name = "REPORT")
public class Report implements Serializable {

	private static final long serialVersionUID = 224914584841313L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REPORT_ID", nullable = false)
	private Long reportId;

	@Column(name="REPORT_REASON", columnDefinition = "NVARCHAR2(500)", nullable = false)
	private String reportReason;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REPORT_SEND_AT", nullable = false)
	private LocalDateTime reportSendAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REPORT_PROC_AT")
	private LocalDateTime reportProcAt;

	@Column(name="REPORT_IS_PROC", columnDefinition = "CHAR(1)", nullable = false)
	private String reportIsProc;

	@Column(name="REPORT_IS_SEND", columnDefinition = "CHAR(1)", nullable = false)
	private String reportIsSend;

	@Column(name="REPORT_CODE", nullable = false)
	private Long reportCode;

	@Column(name="RECIPE_ID")
	private Long recipeId;

	@Column(name="REVIEW_ID")
	private Long reviewId;

	@Column(name="MEM_ID", columnDefinition = "VARCHAR2(20)")
	private String memId;

}
