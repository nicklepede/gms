package com.google.android.gms.cobalt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aspx;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class LogOccurrenceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspx();
    public int a;
    public int b;
    public int c;
    public long d;
    public int[] e;

    private LogOccurrenceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogOccurrenceRequest) {
            LogOccurrenceRequest logOccurrenceRequest = (LogOccurrenceRequest) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(logOccurrenceRequest.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(logOccurrenceRequest.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(logOccurrenceRequest.c)) && atyq.b(Long.valueOf(this.d), Long.valueOf(logOccurrenceRequest.d)) && Arrays.equals(this.e, logOccurrenceRequest.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.p(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public LogOccurrenceRequest(int i, int i2, int i3, long j, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = iArr;
    }
}
