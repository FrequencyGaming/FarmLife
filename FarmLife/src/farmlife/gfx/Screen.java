package farmlife.gfx;

public class Screen {

	public static final int MAP_WIDTH = 64;
	public static final int MAP_WIDTH_MAP_WIDTH = 1;
	
	public int[] tiles = new int[MAP_WIDTH * MAP_WIDTH];
	public int[] colours = new int[MAP_WIDTH * MAP_WIDTH * 4];
	
	public int xOffSet = 0;
	public int yOffSet = 0;
	
	public int width;
	
	public int height;
	
	public SpriteSheet sheet;
	
	public Screen(int width, int height, SpriteSheet sheet){
		this.width = width;
		this.height = height;
		this.sheet = sheet;
		
		for(int i = 0; i < MAP_WIDTH * MAP_WIDTH; i++) {
			colours[i*4+0] = 0xff00ff;
			colours[i*4+1] = 0xffffff;
			colours[i*4+2] = 0xffff00;
			colours[i*4+3] = 0x000000;
		}
	}


}
