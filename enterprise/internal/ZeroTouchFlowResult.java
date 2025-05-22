package com.google.android.gms.enterprise.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbrp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ZeroTouchFlowResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbrp();
    public final int a;
    public final Intent b;

    public ZeroTouchFlowResult(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
