package com.google.android.gms.cast.mirroring.protocol;

import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Display {
    private final Dimension dimensions;
    private final String scaling;

    public Display(Dimension dimension, String str) {
        fvbo.f(dimension, "dimensions");
        this.dimensions = dimension;
        this.scaling = str;
    }

    public static /* synthetic */ Display copy$default(Display display, Dimension dimension, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            dimension = display.dimensions;
        }
        if ((i & 2) != 0) {
            str = display.scaling;
        }
        return display.copy(dimension, str);
    }

    public final Dimension component1() {
        return this.dimensions;
    }

    public final String component2() {
        return this.scaling;
    }

    public final Display copy(Dimension dimension, String str) {
        fvbo.f(dimension, "dimensions");
        return new Display(dimension, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Display)) {
            return false;
        }
        Display display = (Display) obj;
        return fvbo.n(this.dimensions, display.dimensions) && fvbo.n(this.scaling, display.scaling);
    }

    public final Dimension getDimensions() {
        return this.dimensions;
    }

    public final String getScaling() {
        return this.scaling;
    }

    public int hashCode() {
        int hashCode = this.dimensions.hashCode() * 31;
        String str = this.scaling;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Display(dimensions=" + this.dimensions + ", scaling=" + this.scaling + ")";
    }

    public /* synthetic */ Display(Dimension dimension, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dimension, (i & 2) != 0 ? null : str);
    }
}
