package com.google.android.gms.identity.credentialprovider;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bmin;
import defpackage.izs;
import defpackage.izt;
import defpackage.jbg;
import defpackage.jbh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuxiliaryGetCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmin();
    public final String a;
    public final jbh b;
    public final izt c;

    public AuxiliaryGetCredentialResponse(String str, jbh jbhVar, izt iztVar) {
        arwm.c((jbhVar == null) ^ (iztVar == null), "Exactly one of response or exception can be set");
        arwm.c((str == null && iztVar == null) ? false : true, "fullyQualifiedServiceName can only be null when exception is not null");
        this.a = str;
        this.b = jbhVar;
        this.c = iztVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuxiliaryGetCredentialResponse) {
            AuxiliaryGetCredentialResponse auxiliaryGetCredentialResponse = (AuxiliaryGetCredentialResponse) obj;
            if (arwb.b(this.a, auxiliaryGetCredentialResponse.a) && arwb.b(this.c, auxiliaryGetCredentialResponse.c) && arwb.b(this.b, auxiliaryGetCredentialResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        jbh jbhVar = this.b;
        arxc.g(parcel, 3, jbhVar == null ? null : jbg.a(jbhVar), false);
        izt iztVar = this.c;
        arxc.g(parcel, 4, iztVar != null ? izs.a(iztVar) : null, false);
        arxc.c(parcel, a);
    }
}
