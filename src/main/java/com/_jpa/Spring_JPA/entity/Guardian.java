package com._jpa.Spring_JPA.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name ="name",
                column = @Column(
                        name = "guardian_Name"
                )
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(
                        name = "guardian_Email"
                )
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(
                        name = "guardian_mobile"
                )
        )
        })
@Builder
public class Guardian {
    private String name;
    private String email;
    private String mobile;
}
