package com.google.android.gms.smartdevice.quickstart;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dggc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AccountTransferOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dggc();
    public final Intent a;
    public final boolean b;

    public AccountTransferOptions(Intent intent, boolean z) {
        this.a = intent;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intent intent = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, intent, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public AccountTransferOptions() {
        this(null, false);
    }
}
