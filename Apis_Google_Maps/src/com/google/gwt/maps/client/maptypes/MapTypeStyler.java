package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A styler affects how a map's elements will be styled. Each MapTypeStyler should contain one and only one key. If more than one key is specified in a single MapTypeStyler, all but one will be ignored. For example: var rule = {hue: '#ff0000'}.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MapTypeStyler">MapTypeStyler API Doc</a>
 */
public class MapTypeStyler extends JavaScriptObject {

  /**
   * A styler affects how a map's elements will be styled. Each MapTypeStyler should contain one and only one key. If more than one key is specified in a single MapTypeStyler, all but one will be ignored. For example: var rule = {hue: '#ff0000'}.
   * use newInstance();
   */
  protected MapTypeStyler() {}
  
  /**
   * creates A styler affects how a map's elements will be styled. Each MapTypeStyler should contain one and only one key. If more than one key is specified in a single MapTypeStyler, all but one will be ignored. For example: var rule = {hue: '#ff0000'}.
   */
  public final static MapTypeStyler newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets Gamma. Modifies the gamma by raising the lightness to the given power. Valid values: Floating point numbers, [0.01, 10], with 1.0 representing no change.
   * @param gamma
   */
  public final native void setGamma(float gamma) /*-{
    this.gamma = gamma;
  }-*/;
  
  /**
   * gets Gamma. Modifies the gamma by raising the lightness to the given power. Valid values: Floating point numbers, [0.01, 10], with 1.0 representing no change.
   */
  public final native float getGamma() /*-{
    return this.gamma;
  }-*/;
  
  /**
   * sets Sets the hue of the feature to match the hue of the color supplied. Note that the saturation and lightness of the feature is conserved, which means that the feature will not match the color supplied exactly. Valid values: An RGB hex string, i.e. '#ff0000'.
   * @param hue
   */
  public final native void setHue(String hue) /*-{
    this.hue = hue;
  }-*/;
  
  /**
   * gets Sets the hue of the feature to match the hue of the color supplied. Note that the saturation and lightness of the feature is conserved, which means that the feature will not match the color supplied exactly. Valid values: An RGB hex string, i.e. '#ff0000'.
   */
  public final native String getHue() /*-{
    return this.hue;
  }-*/;
  
  /**
   * sets Inverts lightness. A value of true will invert the lightness of the feature while preserving the hue and saturation.
   * @param invert_lightness
   */
  public final native void setInvertLightness(boolean invert_lightness) /*-{
    this.invert_lightness = invert_lightness;
  }-*/;
  
  /**
   * gets Inverts lightness. A value of true will invert the lightness of the feature while preserving the hue and saturation.
   */
  public final native boolean getInvertLightness() /*-{
    return this.invert_lightness;
  }-*/;
  
  /**
   * sets Lightness. Shifts lightness of colors by a percentage of the original value if decreasing and a percentage of the remaining value if increasing. Valid values: [-100, 100].
   * @param lightness
   */
  public final native void setLightness(int lightness) /*-{
    this.lightness = lightness;
  }-*/;
  
  /**
   * gets Lightness. Shifts lightness of colors by a percentage of the original value if decreasing and a percentage of the remaining value if increasing. Valid values: [-100, 100].
   */
  public final native int getLightness() /*-{
    return this.lightness;
  }-*/;
  
  /**
   * sets Saturation. Shifts the saturation of colors by a percentage of the original value if decreasing and a percentage of the remaining value if increasing. Valid values: [-100, 100].
   * @param saturation
   */
  public final native void setSaturation(int saturation) /*-{
    this.saturation = saturation;
  }-*/;

  /**
   *  gets Saturation. Shifts the saturation of colors by a percentage of the original value if decreasing and a percentage of the remaining value if increasing. Valid values: [-100, 100].
   */
  public final native int getSaturation() /*-{
    return this.saturation;
  }-*/;
  
  /**
   * sets Visibility: Valid values: 'on', 'off' or 'simplifed'.
   * @param visibility
   */
  public final native void setVisibility(String visibility) /*-{
    this.visibility = visibility;
  }-*/;
  
  /**
   * gets Visibility: Valid values: 'on', 'off' or 'simplifed'.
   */
  public final native String getVisibility() /*-{
    return this.visibility;
  }-*/;
}
