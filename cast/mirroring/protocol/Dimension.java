package com.google.android.gms.cast.mirroring.protocol;

import defpackage.aned;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Dimension {
    private final String frameRate;
    private final long height;
    private final long width;

    public Dimension(long j, long j2, String str) {
        this.height = j;
        this.width = j2;
        this.frameRate = str;
    }

    public static /* synthetic */ Dimension copy$default(Dimension dimension, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dimension.height;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dimension.width;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = dimension.frameRate;
        }
        return dimension.copy(j3, j4, str);
    }

    public final long component1() {
        return this.height;
    }

    public final long component2() {
        return this.width;
    }

    public final String component3() {
        return this.frameRate;
    }

    public final Dimension copy(long j, long j2, String str) {
        return new Dimension(j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        return this.height == dimension.height && this.width == dimension.width && fvbo.n(this.frameRate, dimension.frameRate);
    }

    public final String getFrameRate() {
        return this.frameRate;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.frameRate;
        return (((aned.a(this.height) * 31) + aned.a(this.width)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Dimension(height=" + this.height + ", width=" + this.width + ", frameRate=" + this.frameRate + ")";
    }

    public /* synthetic */ Dimension(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : str);
    }
}
