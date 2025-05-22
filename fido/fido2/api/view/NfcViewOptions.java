package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzr;
import defpackage.bdzs;
import defpackage.bdzw;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class NfcViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bdzs();
    public final boolean a;
    public final boolean b;

    public NfcViewOptions() {
        this(false, false);
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, defpackage.bdnf
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

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bdzw b() {
        return bdzw.NFC;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NfcViewOptions)) {
            return false;
        }
        NfcViewOptions nfcViewOptions = (NfcViewOptions) obj;
        return this.a == nfcViewOptions.a && this.b == nfcViewOptions.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, z);
        atzr.e(parcel, 3, this.b);
        atzr.c(parcel, a);
    }

    public NfcViewOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
