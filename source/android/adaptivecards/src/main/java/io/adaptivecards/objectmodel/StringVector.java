/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class StringVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_StringVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringVector() {
    this(AdaptiveCardObjectModelJNI.new_StringVector__SWIG_0(), true);
  }

  public StringVector(long n) {
    this(AdaptiveCardObjectModelJNI.new_StringVector__SWIG_1(n), true);
  }

  public long size() {
    return AdaptiveCardObjectModelJNI.StringVector_size(swigCPtr, this);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.StringVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.StringVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.StringVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.StringVector_clear(swigCPtr, this);
  }

  public void add(String x) {
    AdaptiveCardObjectModelJNI.StringVector_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return AdaptiveCardObjectModelJNI.StringVector_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    AdaptiveCardObjectModelJNI.StringVector_set(swigCPtr, this, i, val);
  }

}
