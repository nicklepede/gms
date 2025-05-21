package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbst;
import defpackage.bbtu;
import defpackage.bbtz;
import defpackage.bbut;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ffum;
import defpackage.ffun;
import defpackage.ffuo;
import defpackage.ffup;
import defpackage.ffur;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbtu();
    public final COSEAlgorithmIdentifier a;
    private final PublicKeyCredentialType b;

    public PublicKeyCredentialParameters(String str, int i) {
        arwm.s(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            try {
                this.a = COSEAlgorithmIdentifier.b(i);
            } catch (bbst e) {
                throw new IllegalArgumentException(e);
            }
        } catch (bbtz e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static eiid b(JSONObject jSONObject) {
        try {
            return eiid.j(new PublicKeyCredentialParameters(jSONObject.getString("type"), jSONObject.getInt("alg")));
        } catch (IllegalArgumentException unused) {
            return eigb.a;
        }
    }

    public final int a() {
        return this.a.a();
    }

    public final ffuo c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ffun(bbut.b, new ffup(this.b.b)));
        arrayList.add(new ffun(bbut.g, new ffum(this.a.a())));
        return ffur.n(arrayList);
    }

    public final String d() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.b.equals(publicKeyCredentialParameters.b) && this.a.equals(publicKeyCredentialParameters.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.a;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.b) + ", \n algorithm=" + cOSEAlgorithmIdentifier.toString() + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, d(), false);
        arxc.F(parcel, 3, Integer.valueOf(a()));
        arxc.c(parcel, a);
    }
}
