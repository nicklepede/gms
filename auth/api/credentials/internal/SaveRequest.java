package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.zsg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SaveRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zsg();
    public final Credential a;

    public SaveRequest(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Credential credential = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, credential, i, false);
        atzr.c(parcel, a);
    }
}
