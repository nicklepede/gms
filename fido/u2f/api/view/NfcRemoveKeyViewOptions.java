package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.atzr;
import defpackage.bets;
import defpackage.betz;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class NfcRemoveKeyViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bets();

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final Transport c() {
        return Transport.NFC;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final betz d() {
        return betz.NFC_REMOVE_KEY;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final JSONObject e() {
        return a();
    }

    public final boolean equals(Object obj) {
        return obj instanceof NfcRemoveKeyViewOptions;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzr.c(parcel, atzr.a(parcel));
    }
}
