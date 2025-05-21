package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgw;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class TimeIntervalsImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahgw();
    public final int[] a;

    public TimeIntervalsImpl(int[] iArr) {
        this.a = iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeIntervals=");
        int[] iArr = this.a;
        if (iArr == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            boolean z = true;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = arxc.a(parcel);
        arxc.p(parcel, 2, iArr, false);
        arxc.c(parcel, a);
    }
}
