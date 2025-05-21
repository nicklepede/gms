package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbji;
import defpackage.bcqq;
import defpackage.bcqr;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class RegisterRequest extends AbstractSafeParcelable implements bbji {
    public static final Parcelable.Creator CREATOR = new bcqr();
    public final int a;
    public final ProtocolVersion b;
    public final byte[] c;
    public final String d;

    public RegisterRequest(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        try {
            this.b = ProtocolVersion.b(str);
            this.c = bArr;
            this.d = str2;
        } catch (bcqq e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.bbji
    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.c, registerRequest.c) || this.b != registerRequest.b) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (registerRequest.d != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Arrays.hashCode(this.c) + 31) * 31) + this.b.hashCode();
        String str = this.d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b.d, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public RegisterRequest(ProtocolVersion protocolVersion, byte[] bArr) {
        this.a = 1;
        arwm.s(protocolVersion);
        this.b = protocolVersion;
        this.c = bArr;
        if (protocolVersion == ProtocolVersion.V1) {
            arwm.c(bArr.length == 65, "invalid challengeValue length for V1");
        }
        this.d = null;
    }
}
