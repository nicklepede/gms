package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bdvp;
import defpackage.elgj;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdvp();
    public final UvmEntries a;
    public final AuthenticationExtensionsDevicePublicKeyOutputs b;
    public final AuthenticationExtensionsCredPropsOutputs c;
    public final AuthenticationExtensionsPrfOutputs d;
    public final String e;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs, String str) {
        this.a = uvmEntries;
        this.b = authenticationExtensionsDevicePublicKeyOutputs;
        this.c = authenticationExtensionsCredPropsOutputs;
        this.d = authenticationExtensionsPrfOutputs;
        this.e = str;
    }

    public final elgo a() {
        int i = elgo.d;
        elgj elgjVar = new elgj();
        if (this.c != null) {
            elgjVar.i("credProps");
        }
        if (this.a != null) {
            elgjVar.i("uvm");
        }
        if (this.d != null) {
            elgjVar.i("prf");
        }
        if (this.e != null) {
            elgjVar.i("txAuthSimple");
        }
        return elgjVar.g();
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.c;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.a;
            if (uvmEntries != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    List list = uvmEntries.a;
                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            UvmEntry uvmEntry = (UvmEntry) list.get(i);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(uvmEntry.a);
                            jSONArray2.put(Short.toString(uvmEntry.b));
                            jSONArray2.put(Short.toString(uvmEntry.c));
                            jSONArray.put(i, jSONArray2);
                        }
                    }
                    jSONObject.put("uvm", jSONArray);
                } catch (JSONException e2) {
                    throw new RuntimeException("Error encoding UvmEntries to JSON object", e2);
                }
            }
            AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = this.d;
            if (authenticationExtensionsPrfOutputs != null) {
                jSONObject.put("prf", authenticationExtensionsPrfOutputs.b());
            }
            Object obj = this.e;
            if (obj != null) {
                jSONObject.put("txAuthSimple", obj);
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return atyq.b(this.a, authenticationExtensionsClientOutputs.a) && atyq.b(this.b, authenticationExtensionsClientOutputs.b) && atyq.b(this.c, authenticationExtensionsClientOutputs.c) && atyq.b(this.d, authenticationExtensionsClientOutputs.d) && atyq.b(this.e, authenticationExtensionsClientOutputs.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + b().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UvmEntries uvmEntries = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, uvmEntries, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
