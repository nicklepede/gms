package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.bbtn;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejfg;
import defpackage.ejqi;
import defpackage.ejqk;
import defpackage.ejqn;
import defpackage.enng;
import defpackage.ffuj;
import defpackage.ffun;
import defpackage.ffup;
import defpackage.ffuq;
import defpackage.ffur;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PrfExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbtn();
    private static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public PrfExtension(byte[][] bArr) {
        arwm.b(bArr != null);
        arwm.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            arwm.b(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            arwm.b(bArr[i2] != null);
            int length = bArr[i2].length;
            arwm.b(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static PrfExtension a(ffur ffurVar) {
        ArrayList arrayList = new ArrayList();
        ejfg listIterator = ffurVar.m().a.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            if (((ffur) entry.getKey()).p().a.equals("eval")) {
                arrayList.add(null);
                arrayList.add(AuthenticationExtensionsPrfOutputs.e(((ffur) entry.getValue()).m()));
            } else if (((ffur) entry.getKey()).p().a.equals("evalByCredential")) {
                ejfg listIterator2 = ((ffur) entry.getValue()).m().a.entrySet().listIterator();
                while (listIterator2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) listIterator2.next();
                    arrayList.add(((ffur) entry2.getKey()).j().a.M());
                    arrayList.add(AuthenticationExtensionsPrfOutputs.e(((ffur) entry2.getValue()).m()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new ffuq("no PRF values");
        }
        return new PrfExtension((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public static PrfExtension b(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(i(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(j(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(asnj.f(next));
                    if (z) {
                        arrayList.add(i(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(j(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new PrfExtension((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static ffur e(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr.length == 32) {
            arrayList.add(new ffun(new ffup("first"), ffuj.k(bArr)));
        } else {
            arrayList.add(new ffun(new ffup("first"), ffuj.k(Arrays.copyOfRange(bArr, 0, 32))));
            arrayList.add(new ffun(new ffup("second"), ffuj.k(Arrays.copyOfRange(bArr, 32, 64))));
        }
        return ffur.n(arrayList);
    }

    private static JSONObject g(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", asnj.c(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    private static byte[] h(byte[] bArr) {
        int i = ejqn.b;
        ejqi h = ejqk.a.h();
        h.l(b);
        h.l(bArr);
        return h.s().e();
    }

    private static byte[] i(JSONObject jSONObject) {
        byte[] f = asnj.f(jSONObject.getString("first"));
        if (f.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return f;
        }
        byte[] f2 = asnj.f(jSONObject.getString("second"));
        if (f2.length == 32) {
            return enng.d(f, f2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    private static byte[] j(JSONObject jSONObject) {
        byte[] h = h(asnj.f(jSONObject.getString("first")));
        return !jSONObject.has("second") ? h : enng.d(h, h(asnj.f(jSONObject.getString("second"))));
    }

    private static final Pair k(byte[] bArr) {
        return bArr.length == 32 ? Pair.create(bArr, eigb.a) : Pair.create(Arrays.copyOf(bArr, 32), eiid.j(Arrays.copyOfRange(bArr, 32, 64)));
    }

    public final eiid c(byte[] bArr) {
        int i = 0;
        byte[] bArr2 = null;
        while (true) {
            byte[][] bArr3 = this.a;
            if (i >= bArr3.length) {
                break;
            }
            byte[] bArr4 = bArr3[i];
            if (bArr4 == null) {
                bArr2 = bArr3[i + 1];
            } else if (Arrays.equals(bArr4, bArr)) {
                bArr2 = bArr3[i + 1];
                break;
            }
            i += 2;
        }
        return bArr2 == null ? eigb.a : eiid.j(k(bArr2));
    }

    public final eiid d() {
        byte[][] bArr = this.a;
        return bArr.length != 2 ? eigb.a : eiid.j(k(bArr[1]));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PrfExtension) {
            return Arrays.deepEquals(this.a, ((PrfExtension) obj).a);
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        JSONObject jSONObject2 = null;
        while (true) {
            byte[][] bArr = this.a;
            if (i >= bArr.length) {
                return jSONObject;
            }
            int i2 = i + 1;
            if (bArr[i] == null) {
                jSONObject.put("eval", g(bArr[i2]));
            } else {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                    jSONObject.put("evalByCredential", jSONObject2);
                }
                jSONObject2.put(asnj.c(bArr[i]), g(bArr[i2]));
            }
            i += 2;
        }
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        try {
            return "PrfExtension{" + f().toString() + "}";
        } catch (JSONException e) {
            return "PrfExtension{Exception:" + e.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.A(parcel, 1, bArr);
        arxc.c(parcel, a);
    }
}
