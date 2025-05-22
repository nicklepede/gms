package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodl;
import defpackage.aozp;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public static final aozp a = new aozp("MediaLiveSeekableRange");
    public static final Parcelable.Creator CREATOR = new aodl();

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
        int a2 = atzr.a(parcel);
        atzr.q(parcel, 2, j);
        atzr.q(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.c(parcel, a2);
    }
}
