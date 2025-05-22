package com.google.android.gms.identity.credentialprovider;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bopf;
import defpackage.jbi;
import defpackage.jbj;
import defpackage.jcw;
import defpackage.jcx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuxiliaryGetCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bopf();
    public final String a;
    public final jcx b;
    public final jbj c;

    public AuxiliaryGetCredentialResponse(String str, jcx jcxVar, jbj jbjVar) {
        atzb.c((jcxVar == null) ^ (jbjVar == null), "Exactly one of response or exception can be set");
        atzb.c((str == null && jbjVar == null) ? false : true, "fullyQualifiedServiceName can only be null when exception is not null");
        this.a = str;
        this.b = jcxVar;
        this.c = jbjVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuxiliaryGetCredentialResponse) {
            AuxiliaryGetCredentialResponse auxiliaryGetCredentialResponse = (AuxiliaryGetCredentialResponse) obj;
            if (atyq.b(this.a, auxiliaryGetCredentialResponse.a) && atyq.b(this.c, auxiliaryGetCredentialResponse.c) && atyq.b(this.b, auxiliaryGetCredentialResponse.b)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        jcx jcxVar = this.b;
        atzr.g(parcel, 3, jcxVar == null ? null : jcw.a(jcxVar), false);
        jbj jbjVar = this.c;
        atzr.g(parcel, 4, jbjVar != null ? jbi.a(jbjVar) : null, false);
        atzr.c(parcel, a);
    }
}
