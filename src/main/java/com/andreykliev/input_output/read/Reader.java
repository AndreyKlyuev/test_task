package com.andreykliev.input_output.read;

public interface Reader {
    String getCurrentItem();
    String pickCurrentItem();
    boolean isFlowOver();
}
