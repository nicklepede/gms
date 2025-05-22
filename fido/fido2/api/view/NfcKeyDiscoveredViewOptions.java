package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzr;
import defpackage.bdzq;
import defpackage.bdzw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class NfcKeyDiscoveredViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bdzq();

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bdzw b() {
        return bdzw.NFC_KEY_DISCOVERED;
    }

    public final boolean equals(Object obj) {
        return obj instanceof NfcKeyDiscoveredViewOptions;
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzr.c(parcel, atzr.a(parcel));
    }
}
