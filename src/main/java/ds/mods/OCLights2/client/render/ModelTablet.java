package ds.mods.OCLights2.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTablet extends ModelBase
{
  //fields
    ModelRenderer Screen;
    ModelRenderer BorderBottom;
    ModelRenderer BorderTop;
    ModelRenderer BorderLeft;
    ModelRenderer BorderRight;
    ModelRenderer Bottom;
    ModelRenderer BorderBottomRight;
    ModelRenderer BorderBottomLeft;
    ModelRenderer BorderTopLeft;
    ModelRenderer BorderTopRight;
  
  public ModelTablet()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Screen = new ModelRenderer(this, 0, 14);
      Screen.addBox(-8F, 6F, -6F, 16, 1, 9);
      Screen.setRotationPoint(0F, 0F, 0F);
      Screen.setTextureSize(64, 32);
      Screen.mirror = true;
      setRotation(Screen, 0F, 0F, 0F);
      BorderBottom = new ModelRenderer(this, 0, 0);
      BorderBottom.addBox(-8F, 6F, -8F, 16, 1, 2);
      BorderBottom.setRotationPoint(0F, 0F, 0F);
      BorderBottom.setTextureSize(64, 32);
      BorderBottom.mirror = true;
      setRotation(BorderBottom, 0F, 0F, 0F);
      BorderTop = new ModelRenderer(this, 0, 0);
      BorderTop.addBox(-8F, 6F, 3F, 16, 1, 2);
      BorderTop.setRotationPoint(0F, 0F, 0F);
      BorderTop.setTextureSize(64, 32);
      BorderTop.mirror = true;
      setRotation(BorderTop, 0F, 0F, 0F);
      BorderLeft = new ModelRenderer(this, 0, 0);
      BorderLeft.addBox(8F, 6F, -6F, 2, 2, 9);
      BorderLeft.setRotationPoint(0F, 0F, 0F);
      BorderLeft.setTextureSize(64, 32);
      BorderLeft.mirror = true;
      setRotation(BorderLeft, 0F, 0F, 0F);
      BorderRight = new ModelRenderer(this, 0, 0);
      BorderRight.addBox(-10F, 6F, -6F, 2, 2, 9);
      BorderRight.setRotationPoint(0F, 0F, 0F);
      BorderRight.setTextureSize(64, 32);
      BorderRight.mirror = true;
      setRotation(BorderRight, 0F, 0F, 0F);
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(-8F, 7F, -8F, 16, 1, 13);
      Bottom.setRotationPoint(0F, 0F, 0F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      BorderBottomRight = new ModelRenderer(this, 0, 0);
      BorderBottomRight.addBox(-9F, 6F, -7F, 1, 2, 1);
      BorderBottomRight.setRotationPoint(0F, 0F, 0F);
      BorderBottomRight.setTextureSize(64, 32);
      BorderBottomRight.mirror = true;
      setRotation(BorderBottomRight, 0F, 0F, 0F);
      BorderBottomLeft = new ModelRenderer(this, 0, 0);
      BorderBottomLeft.addBox(8F, 6F, -7F, 1, 2, 1);
      BorderBottomLeft.setRotationPoint(0F, 0F, 0F);
      BorderBottomLeft.setTextureSize(64, 32);
      BorderBottomLeft.mirror = true;
      setRotation(BorderBottomLeft, 0F, 0F, 0F);
      BorderTopLeft = new ModelRenderer(this, 0, 0);
      BorderTopLeft.addBox(8F, 6F, 3F, 1, 2, 1);
      BorderTopLeft.setRotationPoint(0F, 0F, 0F);
      BorderTopLeft.setTextureSize(64, 32);
      BorderTopLeft.mirror = true;
      setRotation(BorderTopLeft, 0F, 0F, 0F);
      BorderTopRight = new ModelRenderer(this, 0, 0);
      BorderTopRight.addBox(-9F, 6F, 3F, 1, 2, 1);
      BorderTopRight.setRotationPoint(0F, 0F, 0F);
      BorderTopRight.setTextureSize(64, 32);
      BorderTopRight.mirror = true;
      setRotation(BorderTopRight, 0F, 0F, 0F);
  }
  
  @Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Screen.render(f5);
    BorderBottom.render(f5);
    BorderTop.render(f5);
    BorderLeft.render(f5);
    BorderRight.render(f5);
    Bottom.render(f5);
    BorderBottomRight.render(f5);
    BorderBottomLeft.render(f5);
    BorderTopLeft.render(f5);
    BorderTopRight.render(f5);
  }
  
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void draw()
	{
		float f5 = 0.0625F;
		Screen.render(f5);
	    BorderBottom.render(f5);
	    BorderTop.render(f5);
	    BorderLeft.render(f5);
	    BorderRight.render(f5);
	    Bottom.render(f5);
	    BorderBottomRight.render(f5);
	    BorderBottomLeft.render(f5);
	    BorderTopLeft.render(f5);
	    BorderTopRight.render(f5);
	}

}
