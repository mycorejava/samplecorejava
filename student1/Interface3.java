
interface personalInfo
{
    void name();
    void contactno();
}
interface educationalInfo
{
    void degree();
    void cgpa();
}
interface workInfo
{
    void orgname();
    void orgaddress();
}

interface medicalInfo extends personalInfo,educationalInfo,workInfo
{
    void bloodgrp();
}


public class Interface3 implements medicalInfo
{
    public void name()
    {
        System.out.println("shiv");
    }
    public void contactno()
    {
        System.out.println("8989989889");
    }
    public void degree()
    {
        System.out.println("bachelors");
    }
    public void cgpa()
    {
        System.out.println("9.0");
    }
    public void orgname()
    {
        System.out.println("Wipro");
    }
    public void orgaddress()
    {
        System.out.println("hinjewadi");
    }
    public void bloodgrp()
    {
        System.out.println("O positive");
    }

    public static void main(String[] args)
    {
        Interface3 i3 = new Interface3();
        i3.name();
        i3.contactno();
        i3.degree();
        i3.cgpa();
        i3.orgname();
        i3.orgaddress();
        i3.bloodgrp();

    }

}
