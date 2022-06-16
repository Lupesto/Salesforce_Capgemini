/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoApp.model;

import java.util.Date;

/**
 *
 * @author lucas
 */
public class tasks {
    private int id;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private Date deadline;
    private Date createAt;
    private Date upgradeAt;

    public tasks(int id, int idProject, String name, String description, String notes, Date deadline, Date createAt, Date upgradeAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.deadline = deadline;
        this.createAt = createAt;
        this.upgradeAt = upgradeAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpgradeAt() {
        return upgradeAt;
    }

    public void setUpgradeAt(Date upgradeAt) {
        this.upgradeAt = upgradeAt;
    }

    @Override
    public String toString() {
        return "tasks{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", notes=" + notes + ", deadline=" + deadline + ", createAt=" + createAt + ", upgradeAt=" + upgradeAt + '}';
    }
    
}
