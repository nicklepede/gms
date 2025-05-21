package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdLauncherIntentInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Intent h;
    public final h i;
    public final boolean j;

    public AdLauncherIntentInfoParcel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        azht azhrVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = intent;
        if (iBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder);
        }
        this.i = (h) ObjectWrapper.a(azhrVar);
        this.j = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.D(parcel, 10, new ObjectWrapper(this.i));
        arxc.e(parcel, 11, this.j);
        arxc.c(parcel, a);
    }
}
