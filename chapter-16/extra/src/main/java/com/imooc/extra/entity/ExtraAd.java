package com.imooc.extra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h1>额外表实体类定义</h1>
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "extra_ad")
public class ExtraAd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 提供 name 的构造函数
     * */
    public ExtraAd(String name) {
        this.name = name;
    }
}
