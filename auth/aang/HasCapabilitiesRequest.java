package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.upm;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new upm();
    public final GoogleAccount a;
    public final List b;

    public HasCapabilitiesRequest(GoogleAccount googleAccount, List list) {
        this.a = googleAccount;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, googleAccount, i, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
