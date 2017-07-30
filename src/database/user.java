/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author ABIMBOLA LINUX
 */
public class user {

    private int ids;
    private String state;

    private String name;
    private int gp;
    private String level;
    private int age;

    public user(int gps) {
        this.gp = gps;
    }

    public user(int id, String names, String states, int gps, String levels, int ages) {
        this.ids = id;
        this.state = states;
        this.name = names;
        this.gp = gps;
        this.level = levels;
        this.age = ages;

    }

    public int getid() {
        return ids;
    }

    public String getstates() {
        return state;
    }

    public String getname() {
        return name;
    }

    public float getgp() {
        return gp;
    }

    public String getlevel() {
        return level;
    }

    public int getages() {
        return age;
    }
}
