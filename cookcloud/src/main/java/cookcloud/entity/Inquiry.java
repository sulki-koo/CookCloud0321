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
@Table(name = "INQUIRY")
public class Inquiry implements Serializable {

	private static final long serialVersionUID = 475871402632459L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="INQUIRY_ID")
	private Long inquiryId;

	@Column(name="INQUIRY_TITLE", columnDefinition = "NVARCHAR2(50)")
	private String inquiryTitle;

	@Column(name="INQUIRY_CONTENT",  columnDefinition = "NVARCHAR2(2000)")
	private String inquiryContent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INQUIRY_INSERT_AT")
	private LocalDateTime inquiryInsertAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INQUIRY_UPDATE_AT")
	private LocalDateTime inquiryUpdateAt;

	@Column(name="INQUIRY_IS_DELETED", columnDefinition = "CHAR(1)")
	private String inquiryIsDeleted;

	@Column(name="INQUIRY_ANSWER_NAME",  columnDefinition = "NVARCHAR2(10)")
	private String inquiryAnswerName;

	@Column(name="INQUIRY_ANSWER",  columnDefinition = "NVARCHAR2(100)")
	private String inquiryAnswer;

	@Column(name="INQUIRY_TYPE_CODE")
	private Long inquiryTypeCode;

	@Column(name="INQUIRY_STATUS_CODE")
	private Long inquiryStatusCode;

	@Column(name="INQUIRY_BOARD_CODE")
	private Long inquiryBoardCode;

	@Column(name="MEM_ID", columnDefinition = "NVARCHAR2(20)")
	private String memId;

}
