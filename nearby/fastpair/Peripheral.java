package com.google.android.gms.nearby.fastpair;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.chzb;
import defpackage.dncl;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Peripheral extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chzb();
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public Peripheral(String str, String str2, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Peripheral) {
            Peripheral peripheral = (Peripheral) obj;
            if (this.a.equals(peripheral.a) && this.b.equals(peripheral.b) && this.c == peripheral.c && this.d == peripheral.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Peripheral{id: %s, supportedProfiles: %s, activeProfiles: %s}", dncl.c(this.a), Long.valueOf(this.c), Long.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
