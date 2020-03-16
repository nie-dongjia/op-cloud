package com.djn.cn.op.cloud.base.micro.service.base.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MDM_BD_ItemCode
 */
@Table(name = "MDM_BD_ItemCode")
public class ItemCode {
    /**
     * 主键Id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 创建者Id
     */
    @Column(name = "creatorId")
    private Long creatorId;

    /**
     * 最后修改者
     */
    @Column(name = "lastUpdateUserId")
    private Long lastUpdateUserId;

    /**
     * 版本号
     */
    @Column(name = "version")
    private Long version;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 更新时间
     */
    @Column(name = "lastUpdateTime")
    private Date lastUpdateTime;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     * 
     */
    @Column(name = "category")
    private String category;

    /**
     * 
     */
    @Column(name = "categoryDesc")
    private String categoryDesc;

    /**
     * Code
     */
    @Column(name = "code")
    private String code;

    /**
     * 
     */
    @Column(name = "culture")
    private String culture;

    /**
     * 所属
     */
    @Column(name = "parentId")
    private Long parentId;

    /**
     * 状态
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 删除标志
     */
    @Column(name = "deleted")
    private Boolean deleted;

    /**
     * 排序
     */
    @Column(name = "sequence")
    private Integer sequence;

    /**
     * 主键Id
     * @return id 主键Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键Id
     * @param id 主键Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 创建者Id
     * @return creatorId 创建者Id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 创建者Id
     * @param creatorId 创建者Id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 最后修改者
     * @return lastUpdateUserId 最后修改者
     */
    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * 最后修改者
     * @param lastUpdateUserId 最后修改者
     */
    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    /**
     * 版本号
     * @return version 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 更新时间
     * @return lastUpdateTime 更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 更新时间
     * @param lastUpdateTime 更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 生成时间
     * @return createTime 生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 生成时间
     * @param createTime 生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return category 
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category 
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 
     * @return categoryDesc 
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * 
     * @param categoryDesc 
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }

    /**
     * Code
     * @return code Code
     */
    public String getCode() {
        return code;
    }

    /**
     * Code
     * @param code Code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 
     * @return culture 
     */
    public String getCulture() {
        return culture;
    }

    /**
     * 
     * @param culture 
     */
    public void setCulture(String culture) {
        this.culture = culture == null ? null : culture.trim();
    }

    /**
     * 所属
     * @return parentId 所属
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 所属
     * @param parentId 所属
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 删除标志
     * @return deleted 删除标志
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 删除标志
     * @param deleted 删除标志
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 排序
     * @return sequence 排序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 排序
     * @param sequence 排序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

	@Override
	public String toString() {
		return "ItemCode [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", lastUpdateUserId="
				+ lastUpdateUserId + ", version=" + version + ", description=" + description + ", lastUpdateTime="
				+ lastUpdateTime + ", createTime=" + createTime + ", category=" + category + ", categoryDesc="
				+ categoryDesc + ", code=" + code + ", culture=" + culture + ", parentId=" + parentId + ", status="
				+ status + ", deleted=" + deleted + ", sequence=" + sequence + "]";
	}
    
}