package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bodn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InstantAppIntentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bodn();
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
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 1, intent, i, false);
        arxc.o(parcel, 2, this.c);
        arxc.v(parcel, 3, this.d, false);
        arxc.c(parcel, a2);
    }
}
