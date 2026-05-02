package org.example.trungcapphuongnam.module.lms.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cau_tra_loi_chon_dap_an")
public class CauTraLoiChonDapAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cau_tra_loi_id")
    private Long cauTraLoiId;

    @Column(name = "dap_an_id")
    private Long dapAnId;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

=======
public class CauTraLoiChonDapAn {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
