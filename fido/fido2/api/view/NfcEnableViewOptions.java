package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzr;
import defpackage.bdzp;
import defpackage.bdzw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class NfcEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bdzp();

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bdzw b() {
        return bdzw.NFC_ENABLE;
    }

    public final boolean equals(Object obj) {
        return obj instanceof NfcEnableViewOptions;
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzr.c(parcel, atzr.a(parcel));
    }
}
