package learning.vladdubceac.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty{
    private String name;
    private String departmentName;

    private List<Faculty> facultyList ;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        facultyList=new ArrayList<Faculty>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void add(Faculty professor){
        facultyList.add(professor);
    }

    public void remove(Faculty professor){
        facultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty(){
        return facultyList;
    }

    @Override
    public String getDetails() {
        return getName()+" is the dean of "+getDepartmentName();
    }
}
