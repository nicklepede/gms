package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.atst;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ControlPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atst();
    public final int a;
    public final int b;
    public final String c;
    public final Intent d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public ControlPage(int i, int i2, String str, Intent intent, String str2, String str3, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = intent;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
