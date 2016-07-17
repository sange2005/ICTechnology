 package net.minecraft.src;
 
 public class Block_EID extends BaseMod {
 
    public String getVersion() {
       return "1.0.0";
    } 
    public void load() {       
       ModLoader.addRecipe(new ItemStack(Block.eid, 1), 
                           new Object[]{ "XXX","XYX","XXX",
                           Character.valueOf('X'),Block.diamond });
                           Character.valueOf('Y'),Block.diamond });

/*
X=グラスファイバー Y=MFSU
*/
 
 
    }   
 }
