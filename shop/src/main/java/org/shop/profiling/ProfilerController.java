package org.shop.profiling;

public class ProfilerController implements ProfilerControllerMBean{
    private boolean enabled;

  public boolean isEnabled() {
    return enabled;
  }

  @Override
  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }
}
