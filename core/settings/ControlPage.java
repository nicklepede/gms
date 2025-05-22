package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avww;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ControlPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avww();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
