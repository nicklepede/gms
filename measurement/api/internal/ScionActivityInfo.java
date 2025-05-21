package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cdgc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ScionActivityInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdgc();
    public final int a;
    public final String b;
    public final Intent c;

    public ScionActivityInfo(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static ScionActivityInfo a(Activity activity) {
        return new ScionActivityInfo(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScionActivityInfo)) {
            return false;
        }
        ScionActivityInfo scionActivityInfo = (ScionActivityInfo) obj;
        return this.a == scionActivityInfo.a && Objects.equals(this.b, scionActivityInfo.b) && Objects.equals(this.c, scionActivityInfo.c);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
