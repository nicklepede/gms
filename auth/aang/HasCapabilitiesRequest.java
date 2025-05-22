package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wll;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wll();
    public final GoogleAccount a;
    public final List b;

    public HasCapabilitiesRequest(GoogleAccount googleAccount, List list) {
        this.a = googleAccount;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, googleAccount, i, false);
        atzr.x(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
