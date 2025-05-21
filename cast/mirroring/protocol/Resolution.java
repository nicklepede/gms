package com.google.android.gms.cast.mirroring.protocol;

import defpackage.aneg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Resolution {
    private final long height;
    private final long width;

    public Resolution(long j, long j2) {
        this.height = j;
        this.width = j2;
    }

    public static /* synthetic */ Resolution copy$default(Resolution resolution, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = resolution.height;
        }
        if ((i & 2) != 0) {
            j2 = resolution.width;
        }
        return resolution.copy(j, j2);
    }

    public final long component1() {
        return this.height;
    }

    public final long component2() {
        return this.width;
    }

    public final Resolution copy(long j, long j2) {
        return new Resolution(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return this.height == resolution.height && this.width == resolution.width;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (aneg.a(this.height) * 31) + aneg.a(this.width);
    }

    public String toString() {
        return "Resolution(height=" + this.height + ", width=" + this.width + ")";
    }
}
