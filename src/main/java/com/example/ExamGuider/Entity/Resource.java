package com.example.ExamGuider.Entity;

import jakarta.persistence.*;
@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String title;
    private String link;
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;

    public Resource() {
    }

    public Resource(Long id, String type, String title, String link, Exam exam) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.link = link;
        this.exam = exam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
