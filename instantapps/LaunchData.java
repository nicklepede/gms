package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bods;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LaunchData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bods();
    public final Intent a;
    public final String b;
    public final String c;
    final BitmapTeleporter d;

    public LaunchData(Intent intent, String str, String str2, BitmapTeleporter bitmapTeleporter) {
        this.a = intent;
        this.b = str;
        this.c = str2;
        this.d = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            bitmapTeleporter.a();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intent intent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, intent, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }
}
