package com.google.android.gms.identity.credentialprovider;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bmij;
import defpackage.izc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuxiliaryClearCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmij();
    public final izc a;

    public AuxiliaryClearCredentialResponse(izc izcVar) {
        this.a = izcVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuxiliaryClearCredentialResponse) {
            return arwb.b(this.a, ((AuxiliaryClearCredentialResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int a = arxc.a(parcel);
        izc izcVar = this.a;
        if (izcVar == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_TYPE", izcVar.a());
            CharSequence charSequence = izcVar.a;
            if (charSequence != null) {
                bundle2.putCharSequence("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_MESSAGE", charSequence);
            }
            bundle = bundle2;
        }
        arxc.g(parcel, 2, bundle, false);
        arxc.c(parcel, a);
    }
}
