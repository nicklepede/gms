package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.arxc;
import defpackage.bcsg;
import defpackage.bcsm;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class NfcViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bcsg();
    public final boolean a;
    public final boolean b;

    public NfcViewOptions() {
        this(false, false);
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions, defpackage.bbji
    public final JSONObject a() {
        JSONObject a = super.a();
        try {
            a.put("deviceRemovedTooSoon", this.a);
            a.put("recommendUsb", this.b);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final Transport c() {
        return Transport.NFC;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final bcsm d() {
        return bcsm.NFC;
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final JSONObject e() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NfcViewOptions)) {
            return false;
        }
        NfcViewOptions nfcViewOptions = (NfcViewOptions) obj;
        return this.a == nfcViewOptions.a && this.b == nfcViewOptions.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // com.google.android.gms.fido.u2f.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, z);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }

    public NfcViewOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
