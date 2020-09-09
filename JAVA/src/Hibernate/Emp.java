package Hibernate;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Emp {
    @Id
    @Column(name="empno")
    private Integer empno;
    
    @Column(name="ename")
    private String ename;
    
    @Column(name="hiredate")
    private Date hiredate; 
    
    @ManyToOne
    @JoinColumn(name="deptno")
    private Dept dept;
    
    public Integer getEmpno() {
        return empno;
    }
    
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
