package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcqn;
import defpackage.eiib;
import defpackage.eiic;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new bcqn();
    public final ErrorCode a;
    public final String b;

    public ErrorResponseData(int i, String str) {
        this.a = ErrorCode.a(i);
        this.b = str;
    }

    @Override // defpackage.bbji
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
        return arwb.b(this.a, errorResponseData.a) && arwb.b(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.f("errorCode", this.a.g);
        String str = this.b;
        if (str != null) {
            b.b("errorMessage", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a.g);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public ErrorResponseData(ErrorCode errorCode) {
        arwm.s(errorCode);
        this.a = errorCode;
        this.b = null;
    }

    public ErrorResponseData(ErrorCode errorCode, String str) {
        arwm.s(errorCode);
        this.a = errorCode;
        this.b = str;
    }
}
