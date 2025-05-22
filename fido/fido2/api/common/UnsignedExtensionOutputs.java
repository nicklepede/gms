package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdyd;
import defpackage.ekus;
import defpackage.elij;
import defpackage.fijl;
import defpackage.fijn;
import defpackage.fijo;
import defpackage.fijp;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UnsignedExtensionOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdyd();
    public final AuthenticationExtensionsPrfOutputs a;

    public UnsignedExtensionOutputs(AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs) {
        this.a = authenticationExtensionsPrfOutputs;
    }

    public static UnsignedExtensionOutputs a(fijp fijpVar) {
        atzb.s(fijpVar);
        atzb.s(fijpVar.m());
        elij elijVar = fijpVar.m().a;
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = null;
        if (elijVar.containsKey(new fijn("prf"))) {
            fijp fijpVar2 = (fijp) elijVar.get(new fijn("prf"));
            try {
                atzb.s(fijpVar2);
                atzb.s(fijpVar2.m());
                elij elijVar2 = fijpVar2.m().a;
                authenticationExtensionsPrfOutputs = new AuthenticationExtensionsPrfOutputs(elijVar2.containsKey(new fijn("enabled")) ? ((fijp) elijVar2.get(new fijn("enabled"))).i().a : false, elijVar2.containsKey(new fijn("results")) ? AuthenticationExtensionsPrfOutputs.e((fijp) elijVar2.get(new fijn("results"))) : null);
            } catch (fijo e) {
                throw new IllegalArgumentException("Error decoding AuthenticationExtensionsPrfOutputs from CBOR", e);
            }
        }
        return new UnsignedExtensionOutputs(authenticationExtensionsPrfOutputs);
    }

    public final fijp b() {
        ArrayList arrayList = new ArrayList();
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = this.a;
        if (authenticationExtensionsPrfOutputs != null) {
            arrayList.add(new fijl(new fijn("prf"), authenticationExtensionsPrfOutputs.a()));
        }
        return fijp.n(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UnsignedExtensionOutputs) {
            return ekus.a(this.a, ((UnsignedExtensionOutputs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = this.a;
            if (authenticationExtensionsPrfOutputs != null) {
                jSONObject.put("prf", authenticationExtensionsPrfOutputs.b());
            }
            return a.b(jSONObject, "UnsignedExtensionOutputs{", "}");
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding UnsignedExtensionOutputs to JSON object", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, authenticationExtensionsPrfOutputs, i, false);
        atzr.c(parcel, a);
    }
}
