package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqli;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LaunchData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqli();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, intent, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }
}
