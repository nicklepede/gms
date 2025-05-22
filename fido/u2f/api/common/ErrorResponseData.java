package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.besa;
import defpackage.ekvg;
import defpackage.ekvh;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new besa();
    public final ErrorCode a;
    public final String b;

    public ErrorResponseData(int i, String str) {
        this.a = ErrorCode.a(i);
        this.b = str;
    }

    @Override // defpackage.bdnf
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.a.g);
            String str = this.b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return atyq.b(this.a, errorResponseData.a) && atyq.b(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        b.f("errorCode", this.a.g);
        String str = this.b;
        if (str != null) {
            b.b("errorMessage", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a.g);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }

    public ErrorResponseData(ErrorCode errorCode) {
        atzb.s(errorCode);
        this.a = errorCode;
        this.b = null;
    }

    public ErrorResponseData(ErrorCode errorCode, String str) {
        atzb.s(errorCode);
        this.a = errorCode;
        this.b = str;
    }
}
