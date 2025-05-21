package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxc;
import defpackage.bbvt;
import defpackage.bbwe;
import defpackage.ejtk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InternalTransportChallengeCompletedViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bbvt();
    public final int a;
    public final byte[] b;

    public InternalTransportChallengeCompletedViewOptions(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, defpackage.bbji
    public final JSONObject a() {
        JSONObject a = super.a();
        try {
            a.put("statusCode", this.a);
            byte[] bArr = this.b;
            if (bArr != null) {
                a.put("signedData", ejtk.d.n(bArr));
            }
            return a;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bbwe b() {
        return bbwe.INTERNAL_TRANSPORT_CHALLENGE_COMPLETED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalTransportChallengeCompletedViewOptions)) {
            return false;
        }
        InternalTransportChallengeCompletedViewOptions internalTransportChallengeCompletedViewOptions = (InternalTransportChallengeCompletedViewOptions) obj;
        return this.a == internalTransportChallengeCompletedViewOptions.a && Arrays.equals(this.b, internalTransportChallengeCompletedViewOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
