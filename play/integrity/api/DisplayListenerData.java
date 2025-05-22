package com.google.android.gms.play.integrity.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cyso;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DisplayListenerData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyso();
    public int[] a;
    public long b;

    public DisplayListenerData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplayListenerData) {
            DisplayListenerData displayListenerData = (DisplayListenerData) obj;
            if (Arrays.equals(this.a, displayListenerData.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(displayListenerData.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, this.a, false);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public DisplayListenerData(int[] iArr, long j) {
        this.a = iArr;
        this.b = j;
    }
}
