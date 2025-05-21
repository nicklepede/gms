package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dgdu;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GlobalState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgdu();
    public final Long a;
    public final String b;
    public final int c;

    public GlobalState(Long l, String str, int i) {
        this.a = l;
        this.b = (String) Objects.requireNonNull(str);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalState)) {
            return false;
        }
        GlobalState globalState = (GlobalState) obj;
        return this.c == globalState.c && Objects.equals(this.a, globalState.a) && Objects.equals(this.b, globalState.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        return "GlobalState{basicPhysicalTickerErrorRateMicrosPerSecond=" + this.a + ", timeSignalIntentAction='" + this.b + ", clockErrorConfidence=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, l);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
