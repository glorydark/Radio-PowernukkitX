package cn.wode490390.nukkit.radio.variable;

import cn.nukkit.Player;
import cn.wode490390.nukkit.radio.Radio;
import cn.wode490390.nukkit.radio.RadioPlugin;
import tip.utils.variables.BaseVariable;

/**
 * @author glorydark
 * @date {2023/8/3} {15:51}
 */
public class TipsVariable extends BaseVariable {

    public TipsVariable(Player player) {
        super(player);
    }

    @Override
    public void strReplace() {
        Radio radio = (Radio) RadioPlugin.radioPlugin.getGlobal();
        if(radio.isListened(player)){
            this.addStrReplaceString("{radio_music_playing}", radio.getPlaying().getName());
        }else{
            this.addStrReplaceString("{radio_music_playing}", "无");
        }
    }

}
