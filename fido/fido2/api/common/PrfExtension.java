package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.bdxe;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elsn;
import defpackage.emdr;
import defpackage.emdt;
import defpackage.emdw;
import defpackage.eqba;
import defpackage.fijh;
import defpackage.fijl;
import defpackage.fijn;
import defpackage.fijo;
import defpackage.fijp;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PrfExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdxe();
    private static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public PrfExtension(byte[][] bArr) {
        atzb.b(bArr != null);
        atzb.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            atzb.b(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            atzb.b(bArr[i2] != null);
            int length = bArr[i2].length;
            atzb.b(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static PrfExtension a(fijp fijpVar) {
        ArrayList arrayList = new ArrayList();
        elsn listIterator = fijpVar.m().a.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            if (((fijp) entry.getKey()).p().a.equals("eval")) {
                arrayList.add(null);
                arrayList.add(AuthenticationExtensionsPrfOutputs.e(((fijp) entry.getValue()).m()));
            } else if (((fijp) entry.getKey()).p().a.equals("evalByCredential")) {
                elsn listIterator2 = ((fijp) entry.getValue()).m().a.entrySet().listIterator();
                while (listIterator2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) listIterator2.next();
                    arrayList.add(((fijp) entry2.getKey()).j().a.M());
                    arrayList.add(AuthenticationExtensionsPrfOutputs.e(((fijp) entry2.getValue()).m()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new fijo("no PRF values");
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
                    arrayList.add(aurd.f(next));
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

    public static fijp e(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr.length == 32) {
            arrayList.add(new fijl(new fijn("first"), fijh.k(bArr)));
        } else {
            arrayList.add(new fijl(new fijn("first"), fijh.k(Arrays.copyOfRange(bArr, 0, 32))));
            arrayList.add(new fijl(new fijn("second"), fijh.k(Arrays.copyOfRange(bArr, 32, 64))));
        }
        return fijp.n(arrayList);
    }

    private static JSONObject g(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", aurd.c(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    private static byte[] h(byte[] bArr) {
        int i = emdw.b;
        emdr h = emdt.a.h();
        h.l(b);
        h.l(bArr);
        return h.s().e();
    }

    private static byte[] i(JSONObject jSONObject) {
        byte[] f = aurd.f(jSONObject.getString("first"));
        if (f.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return f;
        }
        byte[] f2 = aurd.f(jSONObject.getString("second"));
        if (f2.length == 32) {
            return eqba.d(f, f2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    private static byte[] j(JSONObject jSONObject) {
        byte[] h = h(aurd.f(jSONObject.getString("first")));
        return !jSONObject.has("second") ? h : eqba.d(h, h(aurd.f(jSONObject.getString("second"))));
    }

    private static final Pair k(byte[] bArr) {
        return bArr.length == 32 ? Pair.create(bArr, ektg.a) : Pair.create(Arrays.copyOf(bArr, 32), ekvi.j(Arrays.copyOfRange(bArr, 32, 64)));
    }

    public final ekvi c(byte[] bArr) {
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
        return bArr2 == null ? ektg.a : ekvi.j(k(bArr2));
    }

    public final ekvi d() {
        byte[][] bArr = this.a;
        return bArr.length != 2 ? ektg.a : ekvi.j(k(bArr[1]));
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
                jSONObject2.put(aurd.c(bArr[i]), g(bArr[i2]));
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
        int a = atzr.a(parcel);
        atzr.A(parcel, 1, bArr);
        atzr.c(parcel, a);
    }
}
