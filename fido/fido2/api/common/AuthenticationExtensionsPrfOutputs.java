package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.bbsc;
import defpackage.eive;
import defpackage.enng;
import defpackage.feay;
import defpackage.ffug;
import defpackage.ffui;
import defpackage.ffun;
import defpackage.ffuo;
import defpackage.ffup;
import defpackage.ffur;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticationExtensionsPrfOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbsc();
    public final boolean a;
    private final feay b;

    public AuthenticationExtensionsPrfOutputs(boolean z, feay feayVar) {
        this.a = z;
        this.b = feayVar;
    }

    public static byte[] c(String str) {
        try {
            byte[] f = asnj.f(str);
            if (f.length == 32) {
                return f;
            }
            throw new JSONException("PRF result value has wrong length");
        } catch (IllegalArgumentException unused) {
            throw new JSONException("Error decoding PRF result value");
        }
    }

    public static byte[] e(ffur ffurVar) {
        eive eiveVar = ffurVar.m().a;
        if (!eiveVar.containsKey(new ffup("first"))) {
            return null;
        }
        byte[] M = ((ffur) eiveVar.get(new ffup("first"))).j().a.M();
        if (M.length != 32) {
            throw new IllegalArgumentException("Bad PRF input length");
        }
        if (!eiveVar.containsKey(new ffup("second"))) {
            return M;
        }
        byte[] M2 = ((ffur) eiveVar.get(new ffup("second"))).j().a.M();
        if (M2.length == 32) {
            return enng.d(M, M2);
        }
        throw new IllegalArgumentException("Bad PRF input length");
    }

    private static String f(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final ffur a() {
        ffuo o;
        try {
            ArrayList arrayList = new ArrayList();
            byte[] d = d();
            if (d != null) {
                int length = d.length;
                if (length == 32) {
                    o = ffur.o(new ffun(new ffup("first"), ffur.k(d)));
                } else {
                    if (length != 64) {
                        throw new IllegalArgumentException(a.j(length, "invalid length PRF outputs: "));
                    }
                    o = ffur.o(new ffun(new ffup("first"), ffur.k(Arrays.copyOf(d, 32))), new ffun(new ffup("second"), ffur.k(Arrays.copyOfRange(d, 32, 64))));
                }
                arrayList.add(new ffun(new ffup("results"), o));
            }
            arrayList.add(new ffun(new ffup("enabled"), new ffui(this.a)));
            return ffur.n(arrayList);
        } catch (ffug e) {
            throw new IllegalArgumentException("Error encoding AuthenticationExtensionsPrfOutputs to CBOR", e);
        }
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            byte[] d = d();
            if (d != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", f(Arrays.copyOf(d, 32)));
                if (d.length == 64) {
                    jSONObject2.put("second", f(Arrays.copyOfRange(d, 32, 64)));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final byte[] d() {
        feay feayVar = this.b;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsPrfOutputs)) {
            return false;
        }
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) obj;
        return this.a == authenticationExtensionsPrfOutputs.a && arwb.b(this.b, authenticationExtensionsPrfOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        byte[] d = d();
        StringBuilder sb = new StringBuilder("AuthenticationExtensionsPrfOutputs{enabled:");
        sb.append(this.a);
        sb.append("outputs:");
        sb.append(d != null);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.i(parcel, 2, d(), false);
        arxc.c(parcel, a);
    }

    public AuthenticationExtensionsPrfOutputs(boolean z, byte[] bArr) {
        this(z, bArr == null ? null : feay.w(bArr));
    }
}
