/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lhn.annotation.UserExist;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.annotation.Nullable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findByFullname", query = "SELECT u FROM User u WHERE u.fullname = :fullname"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email"),
    @NamedQuery(name = "User.findByPhone", query = "SELECT u FROM User u WHERE u.phone = :phone"),
    @NamedQuery(name = "User.findByAvatar", query = "SELECT u FROM User u WHERE u.avatar = :avatar"),
    @NamedQuery(name = "User.findByAbout", query = "SELECT u FROM User u WHERE u.about = :about"),
    @NamedQuery(name = "User.findByCreatedTime", query = "SELECT u FROM User u WHERE u.createdTime = :createdTime"),
    @NamedQuery(name = "User.findByIsReported", query = "SELECT u FROM User u WHERE u.isReported = :isReported"),
    @NamedQuery(name = "User.findByIsBanned", query = "SELECT u FROM User u WHERE u.isBanned = :isBanned"),
    @NamedQuery(name = "User.findByUserRole", query = "SELECT u FROM User u WHERE u.userRole = :userRole"),
    @NamedQuery(name = "User.findByActive", query = "SELECT u FROM User u WHERE u.active = :active")})
public class User implements Serializable {
    public static final String ADMIN = "ROLE_ADMIN";
    public static final String USER = "ROLE_USER";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull(message="{user.fullname.null}")
    @Size.List({
        @Size(max=45,message="{user.fullname.max}"),
        @Size(min=1,message="{user.fullname.min}")
    })
    @Column(name = "fullname")
    private String fullname;
    @Basic(optional = false)
    @NotNull(message = "{user.username.null}")
    @Size.List({
        @Size(max=20,message="{user.username.max}"),
        @Size(min=1,message="{user.username.min}")
    })
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull(message = "{user.password.null}")
    @Size.List({
        @Size(max=255,message="{user.password.max}"),
        @Size(min=1,message="{user.password.min}")
    })
    @Column(name = "password")
    private String password;
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="{user.email.format}")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max=150,message = "{user.email.size}")
    @Column(name = "email")
    private String email;
    @Pattern(regexp="^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$", message="{user.phone.format}")
    @Basic(optional = false)
    @NotNull
    @Size.List({
        @Size(max=12,message="{user.phone.max}"),
        @Size(min=1,message="{user.phone.min}")
    })
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Size(max=150)
    @Nullable
    @Column(name = "avatar")
    private String avatar = "https://res.cloudinary.com/dyhp6kio1/image/upload/v1651247273/images_sliwp9.png";
    @Size(max=255,message="{user.about.max}")
    @Column(name = "about")
    private String about;
    @Basic(optional = false)
    @Column(name = "facebook")
    private String facebook;
    @Basic(optional = false)
    @Column(name = "instagram")
    private String instagram;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime = new Date();
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_reported")
    private boolean isReported;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_banned")
    private boolean isBanned;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "user_role")
    private String userRole = USER;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active = true;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<Post> postSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<Like1> like1Set;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<Comment> commentSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<AuctionPartis> auctionPartisSet;
    @Transient
    @Nullable
    private String confirmPassword;
    @Transient
    @Nullable
    @JsonIgnore
    private MultipartFile file;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String fullname, String username, String password, String phone, String avatar, Date createdTime, boolean isReported, boolean isBanned, String role, boolean active) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.avatar = avatar;
        this.createdTime = createdTime;
        this.isReported = isReported;
        this.isBanned = isBanned;
        this.userRole = role;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @return the file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(MultipartFile file) {
        this.file = file;
    }

    /**
     * @return the userRole
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * @param userRole the userRole to set
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the instagram
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * @param instagram the instagram to set
     */
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public boolean getIsReported() {
        return isReported;
    }

    public void setIsReported(boolean isReported) {
        this.isReported = isReported;
    }

    public boolean getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @XmlTransient
    public Set<Post> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }

    @XmlTransient
    public Set<Like1> getLike1Set() {
        return like1Set;
    }

    public void setLike1Set(Set<Like1> like1Set) {
        this.like1Set = like1Set;
    }

    @XmlTransient
    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

    @XmlTransient
    public Set<AuctionPartis> getAuctionPartisSet() {
        return auctionPartisSet;
    }

    public void setAuctionPartisSet(Set<AuctionPartis> auctionPartisSet) {
        this.auctionPartisSet = auctionPartisSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lhn.pojo.User[ id=" + id + " ]";
    }
    
}
