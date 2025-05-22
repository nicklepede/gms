package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzr;
import defpackage.bdzl;
import defpackage.bdzw;
import defpackage.emgt;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InternalTransportChallengeCompletedViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bdzl();
    public final int a;
    public final byte[] b;

    public InternalTransportChallengeCompletedViewOptions(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, defpackage.bdnf
    public final JSONObject a() {
        JSONObject a = super.a();
        try {
            a.put("statusCode", this.a);
            byte[] bArr = this.b;
            if (bArr != null) {
                a.put("signedData", emgt.d.n(bArr));
            }
            return a;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bdzw b() {
        return bdzw.INTERNAL_TRANSPORT_CHALLENGE_COMPLETED;
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
