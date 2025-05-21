package com.google.android.gms.smartdevice.quickstart;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ddux;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountTransferOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddux();
    public final Intent a;
    public final boolean b;

    public AccountTransferOptions(Intent intent, boolean z) {
        this.a = intent;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intent intent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, intent, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public AccountTransferOptions() {
        this(null, false);
    }
}
