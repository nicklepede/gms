package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bles;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bles();
    final int a;
    public final String b;
    public final Intent c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }
}
