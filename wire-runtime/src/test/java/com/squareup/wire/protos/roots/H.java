// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 65:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;

public final class H extends Message<H> {
  public static final ProtoAdapter<H> ADAPTER = ProtoAdapter.newMessageAdapter(H.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.roots.E$F#ADAPTER"
  )
  public final E.F ef;

  public H(E.F ef) {
    this(ef, TagMap.EMPTY);
  }

  public H(E.F ef, TagMap tagMap) {
    super(tagMap);
    this.ef = ef;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof H)) return false;
    H o = (H) other;
    return equals(tagMap(), o.tagMap())
        && equals(ef, o.ef);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (ef != null ? ef.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<H, Builder> {
    public E.F ef;

    public Builder() {
    }

    public Builder(H message) {
      super(message);
      if (message == null) return;
      this.ef = message.ef;
    }

    public Builder ef(E.F ef) {
      this.ef = ef;
      return this;
    }

    @Override
    public H build() {
      return new H(ef, buildTagMap());
    }
  }
}
