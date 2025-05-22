package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdzm;
import defpackage.bdzw;
import defpackage.emgt;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InternalTransportChallengeViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bdzm();
    public final String a;
    public final byte[] b;
    public final byte[] c;

    public InternalTransportChallengeViewOptions(String str, byte[] bArr, byte[] bArr2) {
        atzb.s(str);
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
    }

    public static byte[] c(String str) {
        return emgt.d.p(str);
    }

    private static String d(byte[] bArr) {
        return emgt.d.n(bArr);
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, defpackage.bdnf
    public final JSONObject a() {
        JSONObject a = super.a();
        try {
            a.put("rpId", this.a);
            byte[] bArr = this.b;
            if (bArr != null) {
                a.put("keyHandle", d(bArr));
            }
            byte[] bArr2 = this.c;
            if (bArr2 != null) {
                a.put("dataToSign", d(bArr2));
            }
            return a;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bdzw b() {
        return bdzw.INTERNAL_TRANSPORT_CHALLENGE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalTransportChallengeViewOptions)) {
            return false;
        }
        InternalTransportChallengeViewOptions internalTransportChallengeViewOptions = (InternalTransportChallengeViewOptions) obj;
        return this.a.equals(internalTransportChallengeViewOptions.a) && Arrays.equals(this.b, internalTransportChallengeViewOptions.b) && Arrays.equals(this.c, internalTransportChallengeViewOptions.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
