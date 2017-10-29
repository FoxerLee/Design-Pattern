package src.Base;

import src.Base.Entity;
import src.Person.PersonState.*;

/**
 *
 * @author  chenhui
 * @version  2017/10/28.
 */


public class Person extends Entity{
    private int VIT;
    private int maxVIT;  //physical power, man 120, female 100;
    private PersonState state;
    private int gender; //0 stands for female, 1 male, -1 default;

    /**
     *
     * Default builder
     */

    protected Person(){
        this.maxVIT = 0;
        this.state = PersonNormalState.getInstance();
        this.gender = -1;
    };

    /**
     * 人物类构造函数
     * @param name
     * @param gender
     */
    public Person(String name, int gender){
        this.setName(name);
        this.setState(PersonNormalState.getInstance());


        if (gender == 1){
            this.gender = gender;
            this.maxVIT = 120;
        }
        else if (gender == 0){
            this.gender = gender;
            this.maxVIT = 100;
        }
        else {
            System.out.println("Error gender!");
            this.maxVIT = 0;
            this.gender = -1;
        }
        this.setVIT(this.maxVIT);
    }

    /**
     * Getter & Setter
     */
    public void setVIT(int VIT){ this.VIT = VIT; }
    public int getVIT(){ return VIT; }
    public int getMaxVIT(){ return maxVIT; }
    public void setState(PersonState s){
        this.state = s;
        this.state.setPerson(this); //状态回绑定
    }
    public PersonState getState(){
        return state;
    }

    /**
     * 体力值增加或减少
     * @param num 增量值
     */
    public void addVIT(int num){
        this.VIT = getVIT() + num;
        if (getVIT() > getMaxVIT()) {
            setVIT(getMaxVIT());
        }
    }
}
