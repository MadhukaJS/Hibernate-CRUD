package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "department", schema = "myhbmtec", catalog = "")
public class DepartmentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "stuId")
    private String stuId;
    @Basic
    @Column(name = "studentName")
    private String studentName;
    @Basic
    @Column(name = "studept")
    private String studept;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudept() {
        return studept;
    }

    public void setStudept(String studept) {
        this.studept = studept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (stuId != null ? !stuId.equals(that.stuId) : that.stuId != null) return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (studept != null ? !studept.equals(that.studept) : that.studept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuId != null ? stuId.hashCode() : 0;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studept != null ? studept.hashCode() : 0);
        return result;
    }
}
