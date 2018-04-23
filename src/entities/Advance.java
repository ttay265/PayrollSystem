/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ttay2
 */
public class Advance {

    int EmpId;
    float Advance;

    public Advance() {
    }

    public Advance(int EmpId, float Advance) {
        this.EmpId = EmpId;
        this.Advance = Advance;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public float getAdvance() {
        return Advance;
    }

    public void setAdvance(float Advance) {
        this.Advance = Advance;
    }

}
