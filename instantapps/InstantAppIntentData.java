package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqld;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantAppIntentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bqld();
    public static final InstantAppIntentData a = new InstantAppIntentData(null, 1, null);
    public final Intent b;
    public final int c;
    public final String d;

    public InstantAppIntentData(Intent intent, int i, String str) {
        this.b = intent;
        this.c = i;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intent intent = this.b;
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 1, intent, i, false);
        atzr.o(parcel, 2, this.c);
        atzr.v(parcel, 3, this.d, false);
        atzr.c(parcel, a2);
    }
}
