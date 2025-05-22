package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cfpb;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ScionActivityInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfpb();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
