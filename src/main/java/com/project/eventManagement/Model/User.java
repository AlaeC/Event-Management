package com.project.eventManagement.Model;

import com.project.eventManagement.Enum.Role;
import com.project.eventManagement.Util.Model.FileData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.util.List;

@Entity
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, length = 20)
    private Role role;  // USER or ADMIN

    private LocalDate createdAt = LocalDate.now();

    // Relationships
    @OneToMany(mappedBy = "createdBy")
    private List<Event> events;

    @OneToMany(mappedBy = "user")
    private List<EventRegistration> registrations;

    @OneToMany(mappedBy = "user")
    private List<Favorite> favorites;

    @OneToOne
    @JoinColumn
    private FileData profileImage;

    public FileData getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(FileData profileImage) {
        this.profileImage = profileImage;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    public List<EventRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<EventRegistration> registrations) {
        this.registrations = registrations;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
