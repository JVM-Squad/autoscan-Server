package at.aau.se2.model.characters;

import at.aau.se2.model.Actioncard;
import at.aau.se2.model.Monster;

public class Fighter extends Actioncard {
    public Fighter(int zone){
        super(zone);
        this.name = "Schwertkämpfer";
    }

    @Override
    public int doesDmg(Monster monster){
        if(monster.getZone() == this.zone && monster.getRing() == 3) {
            monster.takeDamage(dmg);
            return 0;
        }
        return -1;
    }
}
