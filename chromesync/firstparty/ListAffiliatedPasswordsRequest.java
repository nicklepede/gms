package com.google.android.gms.chromesync.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.apeo;
import defpackage.arxc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ListAffiliatedPasswordsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apeo();
    public final String a;

    public ListAffiliatedPasswordsRequest(String str) {
        fvbo.f(str, "urlFacetId");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a);
    }
}
