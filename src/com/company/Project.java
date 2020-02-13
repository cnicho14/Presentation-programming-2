package com.company;

import java.util.List;

/**
 * Is there something wrong with this approach?
 * if there is how do we fix the problem?
 */
public class Project
{
    //private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    //private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
    private List<Developer> developers;

    public Project(List<Developer> developers)
    {
        this.developers = developers;
    }

    public void implement()
    {
        developers.forEach(Developer::develop);
    }
}
