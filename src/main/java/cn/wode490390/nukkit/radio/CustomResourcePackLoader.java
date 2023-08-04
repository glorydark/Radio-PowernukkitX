package cn.wode490390.nukkit.radio;

import cn.nukkit.resourcepacks.ResourcePack;
import cn.nukkit.resourcepacks.loader.ResourcePackLoader;

import java.util.List;

/**
 * @author glorydark
 * @date {2023/8/2} {23:54}
 */
public class CustomResourcePackLoader implements ResourcePackLoader {

    private List<ResourcePack> pks;

    public CustomResourcePackLoader(List<ResourcePack> pks){
        this.pks = pks;
    }

    @Override
    public List<ResourcePack> loadPacks() {
        return this.pks;
    }
}
