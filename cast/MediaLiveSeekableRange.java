package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amca;
import defpackage.amye;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public static final amye a = new amye("MediaLiveSeekableRange");
    public static final Parcelable.Creator CREATOR = new amca();

    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.b = Math.max(j, 0L);
        this.c = Math.max(j2, 0L);
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.b == mediaLiveSeekableRange.b && this.c == mediaLiveSeekableRange.c && this.d == mediaLiveSeekableRange.d && this.e == mediaLiveSeekableRange.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int a2 = arxc.a(parcel);
        arxc.q(parcel, 2, j);
        arxc.q(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.c(parcel, a2);
    }
}
