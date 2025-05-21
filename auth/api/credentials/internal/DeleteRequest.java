package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.xtx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xtx();
    public final Credential a;

    public DeleteRequest(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Credential credential = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, credential, i, false);
        arxc.c(parcel, a);
    }
}
