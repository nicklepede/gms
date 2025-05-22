package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.bdvt;
import defpackage.elij;
import defpackage.eqba;
import defpackage.fgpr;
import defpackage.fije;
import defpackage.fijg;
import defpackage.fijl;
import defpackage.fijm;
import defpackage.fijn;
import defpackage.fijp;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticationExtensionsPrfOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdvt();
    public final boolean a;
    private final fgpr b;

    public AuthenticationExtensionsPrfOutputs(boolean z, fgpr fgprVar) {
        this.a = z;
        this.b = fgprVar;
    }

    public static byte[] c(String str) {
        try {
            byte[] f = aurd.f(str);
            if (f.length == 32) {
                return f;
            }
            throw new JSONException("PRF result value has wrong length");
        } catch (IllegalArgumentException unused) {
            throw new JSONException("Error decoding PRF result value");
        }
    }

    public static byte[] e(fijp fijpVar) {
        elij elijVar = fijpVar.m().a;
        if (!elijVar.containsKey(new fijn("first"))) {
            return null;
        }
        byte[] M = ((fijp) elijVar.get(new fijn("first"))).j().a.M();
        if (M.length != 32) {
            throw new IllegalArgumentException("Bad PRF input length");
        }
        if (!elijVar.containsKey(new fijn("second"))) {
            return M;
        }
        byte[] M2 = ((fijp) elijVar.get(new fijn("second"))).j().a.M();
        if (M2.length == 32) {
            return eqba.d(M, M2);
        }
        throw new IllegalArgumentException("Bad PRF input length");
    }

    private static String f(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final fijp a() {
        fijm o;
        try {
            ArrayList arrayList = new ArrayList();
            byte[] d = d();
            if (d != null) {
                int length = d.length;
                if (length == 32) {
                    o = fijp.o(new fijl(new fijn("first"), fijp.k(d)));
                } else {
                    if (length != 64) {
                        throw new IllegalArgumentException(a.j(length, "invalid length PRF outputs: "));
                    }
                    o = fijp.o(new fijl(new fijn("first"), fijp.k(Arrays.copyOf(d, 32))), new fijl(new fijn("second"), fijp.k(Arrays.copyOfRange(d, 32, 64))));
                }
                arrayList.add(new fijl(new fijn("results"), o));
            }
            arrayList.add(new fijl(new fijn("enabled"), new fijg(this.a)));
            return fijp.n(arrayList);
        } catch (fije e) {
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
        fgpr fgprVar = this.b;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsPrfOutputs)) {
            return false;
        }
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) obj;
        return this.a == authenticationExtensionsPrfOutputs.a && atyq.b(this.b, authenticationExtensionsPrfOutputs.b);
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.i(parcel, 2, d(), false);
        atzr.c(parcel, a);
    }

    public AuthenticationExtensionsPrfOutputs(boolean z, byte[] bArr) {
        this(z, bArr == null ? null : fgpr.w(bArr));
    }
}
