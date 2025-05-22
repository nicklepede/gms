package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ekvl;
import defpackage.fkbv;
import defpackage.wlr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SyncAccountStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wlr();
    public final GoogleAccount a;
    public final fkbv b;

    public SyncAccountStateRequest(GoogleAccount googleAccount, int i) {
        this.a = googleAccount;
        fkbv b = fkbv.b(i);
        ekvl.z(b, "Invalid value for FlowName enum");
        this.b = b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, googleAccount, i, false);
        atzr.o(parcel, 2, this.b.a());
        atzr.c(parcel, a);
    }
}
