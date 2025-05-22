package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdwk;
import defpackage.bdxl;
import defpackage.bdxq;
import defpackage.bdyk;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.fijk;
import defpackage.fijl;
import defpackage.fijm;
import defpackage.fijn;
import defpackage.fijp;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdxl();
    public final COSEAlgorithmIdentifier a;
    private final PublicKeyCredentialType b;

    public PublicKeyCredentialParameters(String str, int i) {
        atzb.s(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            try {
                this.a = COSEAlgorithmIdentifier.b(i);
            } catch (bdwk e) {
                throw new IllegalArgumentException(e);
            }
        } catch (bdxq e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static ekvi b(JSONObject jSONObject) {
        try {
            return ekvi.j(new PublicKeyCredentialParameters(jSONObject.getString("type"), jSONObject.getInt("alg")));
        } catch (IllegalArgumentException unused) {
            return ektg.a;
        }
    }

    public final int a() {
        return this.a.a();
    }

    public final fijm c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fijl(bdyk.b, new fijn(this.b.b)));
        arrayList.add(new fijl(bdyk.g, new fijk(this.a.a())));
        return fijp.n(arrayList);
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, d(), false);
        atzr.F(parcel, 3, Integer.valueOf(a()));
        atzr.c(parcel, a);
    }
}
