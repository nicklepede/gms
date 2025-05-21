package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.arxc;
import defpackage.bcsh;
import defpackage.bcsm;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PinConfirmViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bcsh();

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final Transport c() {
        return null;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final bcsm d() {
        return bcsm.PIN_CONFIRM;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final JSONObject e() {
        return a();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PinConfirmViewOptions);
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arxc.c(parcel, arxc.a(parcel));
    }
}
