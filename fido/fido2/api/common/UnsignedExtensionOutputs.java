package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbum;
import defpackage.eihn;
import defpackage.eive;
import defpackage.ffun;
import defpackage.ffup;
import defpackage.ffuq;
import defpackage.ffur;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UnsignedExtensionOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbum();
    public final AuthenticationExtensionsPrfOutputs a;

    public UnsignedExtensionOutputs(AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs) {
        this.a = authenticationExtensionsPrfOutputs;
    }

    public static UnsignedExtensionOutputs a(ffur ffurVar) {
        arwm.s(ffurVar);
        arwm.s(ffurVar.m());
        eive eiveVar = ffurVar.m().a;
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = null;
        if (eiveVar.containsKey(new ffup("prf"))) {
            ffur ffurVar2 = (ffur) eiveVar.get(new ffup("prf"));
            try {
                arwm.s(ffurVar2);
                arwm.s(ffurVar2.m());
                eive eiveVar2 = ffurVar2.m().a;
                authenticationExtensionsPrfOutputs = new AuthenticationExtensionsPrfOutputs(eiveVar2.containsKey(new ffup("enabled")) ? ((ffur) eiveVar2.get(new ffup("enabled"))).i().a : false, eiveVar2.containsKey(new ffup("results")) ? AuthenticationExtensionsPrfOutputs.e((ffur) eiveVar2.get(new ffup("results"))) : null);
            } catch (ffuq e) {
                throw new IllegalArgumentException("Error decoding AuthenticationExtensionsPrfOutputs from CBOR", e);
            }
        }
        return new UnsignedExtensionOutputs(authenticationExtensionsPrfOutputs);
    }

    public final ffur b() {
        ArrayList arrayList = new ArrayList();
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = this.a;
        if (authenticationExtensionsPrfOutputs != null) {
            arrayList.add(new ffun(new ffup("prf"), authenticationExtensionsPrfOutputs.a()));
        }
        return ffur.n(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UnsignedExtensionOutputs) {
            return eihn.a(this.a, ((UnsignedExtensionOutputs) obj).a);
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, authenticationExtensionsPrfOutputs, i, false);
        arxc.c(parcel, a);
    }
}
